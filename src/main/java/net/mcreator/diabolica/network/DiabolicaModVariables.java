package net.mcreator.diabolica.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.diabolica.DiabolicaMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiabolicaModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		DiabolicaMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		DiabolicaMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.x = original.x;
			clone.y = original.y;
			clone.z = original.z;
			clone.contract_signed = original.contract_signed;
			clone.dimension = original.dimension;
			clone.buttonpressed = original.buttonpressed;
			clone.health = original.health;
			clone.plyer = original.plyer;
			clone.yubgub = original.yubgub;
			clone.colorRarityNames = original.colorRarityNames;
			clone.attack_dmg = original.attack_dmg;
			clone.recentkill = original.recentkill;
			clone.killa = original.killa;
			clone.spawn_x = original.spawn_x;
			clone.spawn_y = original.spawn_y;
			clone.spawn_z = original.spawn_z;
			clone.quest_one_completed = original.quest_one_completed;
			clone.quest_two_completed = original.quest_two_completed;
			clone.in_stasis = original.in_stasis;
			clone.StasisAdventureMode = original.StasisAdventureMode;
			if (!event.isWasDeath()) {
				clone.player_levitating = original.player_levitating;
				clone.player_hovering = original.player_hovering;
				clone.player_used_totem = original.player_used_totem;
				clone.player_used_totem2 = original.player_used_totem2;
				clone.send_away = original.send_away;
				clone.launch_used = original.launch_used;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					DiabolicaMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					DiabolicaMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					DiabolicaMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "diabolica_worldvars";
		public boolean StasisLoaded = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			StasisLoaded = nbt.getBoolean("StasisLoaded");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("StasisLoaded", StasisLoaded);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				DiabolicaMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "diabolica_mapvars";
		public boolean dragon_killed = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			dragon_killed = nbt.getBoolean("dragon_killed");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("dragon_killed", dragon_killed);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				DiabolicaMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("diabolica", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double x = 0.0;
		public double y = 0;
		public double z = 0;
		public boolean player_levitating = false;
		public boolean player_hovering = false;
		public boolean player_used_totem = false;
		public boolean player_used_totem2 = false;
		public boolean contract_signed = false;
		public String dimension = "\"\"";
		public boolean send_away = false;
		public boolean buttonpressed = false;
		public double health = 20.0;
		public String plyer = "\"\"";
		public boolean yubgub = false;
		public boolean colorRarityNames = true;
		public double attack_dmg = 0;
		public String recentkill = "\"\"";
		public double killa = 0;
		public boolean launch_used = false;
		public double spawn_x = 0;
		public double spawn_y = 0;
		public double spawn_z = 0;
		public boolean quest_one_completed = false;
		public boolean quest_two_completed = false;
		public boolean in_stasis = false;
		public boolean StasisAdventureMode = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				DiabolicaMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("x", x);
			nbt.putDouble("y", y);
			nbt.putDouble("z", z);
			nbt.putBoolean("player_levitating", player_levitating);
			nbt.putBoolean("player_hovering", player_hovering);
			nbt.putBoolean("player_used_totem", player_used_totem);
			nbt.putBoolean("player_used_totem2", player_used_totem2);
			nbt.putBoolean("contract_signed", contract_signed);
			nbt.putString("dimension", dimension);
			nbt.putBoolean("send_away", send_away);
			nbt.putBoolean("buttonpressed", buttonpressed);
			nbt.putDouble("health", health);
			nbt.putString("plyer", plyer);
			nbt.putBoolean("yubgub", yubgub);
			nbt.putBoolean("colorRarityNames", colorRarityNames);
			nbt.putDouble("attack_dmg", attack_dmg);
			nbt.putString("recentkill", recentkill);
			nbt.putDouble("killa", killa);
			nbt.putBoolean("launch_used", launch_used);
			nbt.putDouble("spawn_x", spawn_x);
			nbt.putDouble("spawn_y", spawn_y);
			nbt.putDouble("spawn_z", spawn_z);
			nbt.putBoolean("quest_one_completed", quest_one_completed);
			nbt.putBoolean("quest_two_completed", quest_two_completed);
			nbt.putBoolean("in_stasis", in_stasis);
			nbt.putBoolean("StasisAdventureMode", StasisAdventureMode);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			x = nbt.getDouble("x");
			y = nbt.getDouble("y");
			z = nbt.getDouble("z");
			player_levitating = nbt.getBoolean("player_levitating");
			player_hovering = nbt.getBoolean("player_hovering");
			player_used_totem = nbt.getBoolean("player_used_totem");
			player_used_totem2 = nbt.getBoolean("player_used_totem2");
			contract_signed = nbt.getBoolean("contract_signed");
			dimension = nbt.getString("dimension");
			send_away = nbt.getBoolean("send_away");
			buttonpressed = nbt.getBoolean("buttonpressed");
			health = nbt.getDouble("health");
			plyer = nbt.getString("plyer");
			yubgub = nbt.getBoolean("yubgub");
			colorRarityNames = nbt.getBoolean("colorRarityNames");
			attack_dmg = nbt.getDouble("attack_dmg");
			recentkill = nbt.getString("recentkill");
			killa = nbt.getDouble("killa");
			launch_used = nbt.getBoolean("launch_used");
			spawn_x = nbt.getDouble("spawn_x");
			spawn_y = nbt.getDouble("spawn_y");
			spawn_z = nbt.getDouble("spawn_z");
			quest_one_completed = nbt.getBoolean("quest_one_completed");
			quest_two_completed = nbt.getBoolean("quest_two_completed");
			in_stasis = nbt.getBoolean("in_stasis");
			StasisAdventureMode = nbt.getBoolean("StasisAdventureMode");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.x = message.data.x;
					variables.y = message.data.y;
					variables.z = message.data.z;
					variables.player_levitating = message.data.player_levitating;
					variables.player_hovering = message.data.player_hovering;
					variables.player_used_totem = message.data.player_used_totem;
					variables.player_used_totem2 = message.data.player_used_totem2;
					variables.contract_signed = message.data.contract_signed;
					variables.dimension = message.data.dimension;
					variables.send_away = message.data.send_away;
					variables.buttonpressed = message.data.buttonpressed;
					variables.health = message.data.health;
					variables.plyer = message.data.plyer;
					variables.yubgub = message.data.yubgub;
					variables.colorRarityNames = message.data.colorRarityNames;
					variables.attack_dmg = message.data.attack_dmg;
					variables.recentkill = message.data.recentkill;
					variables.killa = message.data.killa;
					variables.launch_used = message.data.launch_used;
					variables.spawn_x = message.data.spawn_x;
					variables.spawn_y = message.data.spawn_y;
					variables.spawn_z = message.data.spawn_z;
					variables.quest_one_completed = message.data.quest_one_completed;
					variables.quest_two_completed = message.data.quest_two_completed;
					variables.in_stasis = message.data.in_stasis;
					variables.StasisAdventureMode = message.data.StasisAdventureMode;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

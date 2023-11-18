package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.diabolica.network.DiabolicaModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LevitatePlayerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).player_levitating == true) {
			{
				Entity _ent = entity;
				_ent.teleportTo(((entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).x), y,
						((entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).z));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(((entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).x), y,
							((entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).z), _ent.getYRot(), _ent.getXRot());
			}
			if (y > (entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).y + 4
					|| !((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.WATER)) {
				{
					boolean _setval = true;
					entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.player_hovering = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.LEVITATION);
				{
					boolean _setval = false;
					entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.player_levitating = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.JUMP);
				{
					boolean _setval = true;
					entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.player_used_totem2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

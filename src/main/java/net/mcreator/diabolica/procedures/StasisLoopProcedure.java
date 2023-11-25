package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StasisLoopProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(double y, double z, Entity entity) {
		execute(null, y, z, entity);
	}

	private static void execute(@Nullable Event event, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("diabolica:stasis"))) && entity.getX() > 150) {
			{
				Entity _ent = entity;
				_ent.teleportTo((-145), y, z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((-145), y, z, _ent.getYRot(), _ent.getXRot());
			}
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("diabolica:stasis"))) && entity.getX() < -150) {
			{
				Entity _ent = entity;
				_ent.teleportTo(145, y, z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(145, y, z, _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}

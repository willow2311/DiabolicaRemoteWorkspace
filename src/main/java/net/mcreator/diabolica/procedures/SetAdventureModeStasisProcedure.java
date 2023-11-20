package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetAdventureModeStasisProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getDimension(), event.getEntity());
	}

	public static void execute(ResourceKey<Level> dimension, Entity entity) {
		execute(null, dimension, entity);
	}

	private static void execute(@Nullable Event event, ResourceKey<Level> dimension, Entity entity) {
		if (dimension == null || entity == null)
			return;
		if (dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("diabolica:stasis")))) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.ADVENTURE);
		}
	}
}

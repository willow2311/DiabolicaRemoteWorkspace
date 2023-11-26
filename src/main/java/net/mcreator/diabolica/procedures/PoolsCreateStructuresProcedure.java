package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.diabolica.network.DiabolicaModVariables;
import net.mcreator.diabolica.init.DiabolicaModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PoolsCreateStructuresProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("diabolica:pools"))) && DiabolicaModVariables.WorldVariables.get(world).PoolsLoaded == false) {
			world.setBlock(new BlockPos(0, 0, 0), DiabolicaModBlocks.POOL_PLACER.get().defaultBlockState(), 3);
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos(0, 0, 0), _level.getBlockState(new BlockPos(0, 0, 0)).getBlock());
			DiabolicaModVariables.WorldVariables.get(world).PoolsLoaded = true;
			DiabolicaModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}

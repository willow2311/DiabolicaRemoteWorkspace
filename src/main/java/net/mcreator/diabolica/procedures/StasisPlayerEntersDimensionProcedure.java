package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.diabolica.network.DiabolicaModVariables;
import net.mcreator.diabolica.init.DiabolicaModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StasisPlayerEntersDimensionProcedure {
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
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("diabolica:stasis"))) && DiabolicaModVariables.WorldVariables.get(world).StasisLoaded == false) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("diabolica", "bus_stop"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(10, -1, -6), new BlockPos(10, -1, -6), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(0, 0, -1), DiabolicaModBlocks.ROAD_PLACER_2.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(0, 0, 0), DiabolicaModBlocks.ROAD_PLACER.get().defaultBlockState(), 3);
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos(4, 0, 0), _level.getBlockState(new BlockPos(4, 0, 0)).getBlock());
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos(4, 0, -1), _level.getBlockState(new BlockPos(4, 0, -1)).getBlock());
			DiabolicaModVariables.WorldVariables.get(world).StasisLoaded = true;
			DiabolicaModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}

package net.mcreator.diabolica.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.diabolica.init.DiabolicaModBlocks;

public class RoadPlacerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rand = 0;
		rand = Mth.nextInt(RandomSource.create(), 1, 3);
		if (rand == 1) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("diabolica", "liminal_road_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 1, z), BlockPos.containing(x - 4, y - 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rand == 2) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("diabolica", "liminal_road_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 1, z), BlockPos.containing(x - 4, y - 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rand == 3) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("diabolica", "liminal_road_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 1, z), BlockPos.containing(x - 4, y - 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		world.setBlock(BlockPos.containing(x, y, z + 15), DiabolicaModBlocks.ROAD_PLACER.get().defaultBlockState(), 3);
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y, z + 15), _level.getBlockState(BlockPos.containing(x, y, z + 15)).getBlock());
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

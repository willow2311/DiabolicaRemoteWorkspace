package net.mcreator.diabolica.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.diabolica.init.DiabolicaModBlocks;

public class PoolPlacerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rand = 0;
		double randstore = 0;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("diabolica", "pools_resevoir_fixed"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y, z - 6), BlockPos.containing(x - 6, y, z - 6), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
						_serverworld.random, 3);
			}
		}
		world.setBlock(BlockPos.containing(x, y + 150, z), Blocks.BARRIER.defaultBlockState(), 3);
		if (!((world.getBlockState(BlockPos.containing(x + 13, y + 150, z))).getBlock() == Blocks.BARRIER)) {
			world.setBlock(BlockPos.containing(x + 13, y, z), DiabolicaModBlocks.POOL_PLACER.get().defaultBlockState(), 3);
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x + 13, y, z), _level.getBlockState(BlockPos.containing(x + 13, y, z)).getBlock());
		}
		if (!((world.getBlockState(BlockPos.containing(x - 13, y + 150, z))).getBlock() == Blocks.BARRIER)) {
			world.setBlock(BlockPos.containing(x - 13, y, z), DiabolicaModBlocks.POOL_PLACER.get().defaultBlockState(), 3);
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x - 13, y, z), _level.getBlockState(BlockPos.containing(x - 13, y, z)).getBlock());
		}
		if (!((world.getBlockState(BlockPos.containing(x, y + 150, z + 13))).getBlock() == Blocks.BARRIER)) {
			world.setBlock(BlockPos.containing(x, y, z + 13), DiabolicaModBlocks.POOL_PLACER.get().defaultBlockState(), 3);
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z + 13), _level.getBlockState(BlockPos.containing(x, y, z + 13)).getBlock());
		}
		if (!((world.getBlockState(BlockPos.containing(x, y + 150, z - 13))).getBlock() == Blocks.BARRIER)) {
			world.setBlock(BlockPos.containing(x, y, z - 13), DiabolicaModBlocks.POOL_PLACER.get().defaultBlockState(), 3);
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z - 13), _level.getBlockState(BlockPos.containing(x, y, z - 13)).getBlock());
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

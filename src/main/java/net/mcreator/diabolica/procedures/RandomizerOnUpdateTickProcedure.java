package net.mcreator.diabolica.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.diabolica.init.DiabolicaModBlocks;
import net.mcreator.diabolica.DiabolicaMod;

import java.util.Map;

public class RandomizerOnUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DiabolicaMod.queueServerWork(2, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == DiabolicaModBlocks.RANDOMIZER_ON.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = DiabolicaModBlocks.RANDOMIZER.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof Level _level)
					_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
			}
		});
	}
}


package net.mcreator.diabolica.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PoolWaterBlock extends LiquidBlock {
	public PoolWaterBlock() {
		super(() -> DiabolicaModFluids.POOL_WATER.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		PoolWaterMobplayerCollidesBlockProcedure.execute();
	}
}
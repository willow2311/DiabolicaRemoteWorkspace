
package net.mcreator.diabolica.fluid;

public abstract class PoolWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DiabolicaModFluidTypes.POOL_WATER_TYPE.get(), () -> DiabolicaModFluids.POOL_WATER.get(), () -> DiabolicaModFluids.FLOWING_POOL_WATER.get())
			.explosionResistance(100f).bucket(() -> DiabolicaModItems.POOL_WATER_BUCKET.get()).block(() -> (LiquidBlock) DiabolicaModBlocks.POOL_WATER.get());

	private PoolWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	public static class Source extends PoolWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PoolWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

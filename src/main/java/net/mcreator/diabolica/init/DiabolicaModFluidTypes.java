
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.diabolica.fluid.types.PoolWaterFluidType;
import net.mcreator.diabolica.DiabolicaMod;

public class DiabolicaModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, DiabolicaMod.MODID);
	public static final RegistryObject<FluidType> POOL_WATER_TYPE = REGISTRY.register("pool_water", () -> new PoolWaterFluidType());
}

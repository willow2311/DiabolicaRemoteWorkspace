
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.diabolica.DiabolicaMod;

public class DiabolicaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DiabolicaMod.MODID);
	public static final RegistryObject<SimpleParticleType> RED_BOOM = REGISTRY.register("red_boom", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> EVIL_PARTICLE = REGISTRY.register("evil_particle", () -> new SimpleParticleType(false));
}

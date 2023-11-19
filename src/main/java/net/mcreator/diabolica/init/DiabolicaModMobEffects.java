
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.diabolica.potion.BloodPactMobEffect;
import net.mcreator.diabolica.potion.AugmentedMobEffect;
import net.mcreator.diabolica.DiabolicaMod;

public class DiabolicaModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DiabolicaMod.MODID);
	public static final RegistryObject<MobEffect> BLOOD_PACT = REGISTRY.register("blood_pact", () -> new BloodPactMobEffect());
	public static final RegistryObject<MobEffect> AUGMENTED = REGISTRY.register("augmented", () -> new AugmentedMobEffect());
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.diabolica.DiabolicaMod;

public class DiabolicaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DiabolicaMod.MODID);
	public static final RegistryObject<SoundEvent> WIND_GUST = REGISTRY.register("wind_gust", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diabolica", "wind_gust")));
	public static final RegistryObject<SoundEvent> ASHES_FALL = REGISTRY.register("ashes_fall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diabolica", "ashes_fall")));
	public static final RegistryObject<SoundEvent> OPEN_CONTRACT = REGISTRY.register("open_contract", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diabolica", "open_contract")));
	public static final RegistryObject<SoundEvent> CHIMES = REGISTRY.register("chimes", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diabolica", "chimes")));
	public static final RegistryObject<SoundEvent> BOING = REGISTRY.register("boing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("diabolica", "boing")));
}

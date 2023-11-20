
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.diabolica.world.features.ZedcoStoreFlippedFeature;
import net.mcreator.diabolica.world.features.ZedcoStoreFeature;
import net.mcreator.diabolica.world.features.LiminalRoad3Feature;
import net.mcreator.diabolica.world.features.LiminalRoad2Feature;
import net.mcreator.diabolica.world.features.LiminalRoad1Feature;
import net.mcreator.diabolica.world.features.BusStopFeature;
import net.mcreator.diabolica.DiabolicaMod;

@Mod.EventBusSubscriber
public class DiabolicaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DiabolicaMod.MODID);
	public static final RegistryObject<Feature<?>> LIMINAL_ROAD_1 = REGISTRY.register("liminal_road_1", LiminalRoad1Feature::new);
	public static final RegistryObject<Feature<?>> LIMINAL_ROAD_2 = REGISTRY.register("liminal_road_2", LiminalRoad2Feature::new);
	public static final RegistryObject<Feature<?>> LIMINAL_ROAD_3 = REGISTRY.register("liminal_road_3", LiminalRoad3Feature::new);
	public static final RegistryObject<Feature<?>> BUS_STOP = REGISTRY.register("bus_stop", BusStopFeature::new);
	public static final RegistryObject<Feature<?>> ZEDCO_STORE = REGISTRY.register("zedco_store", ZedcoStoreFeature::new);
	public static final RegistryObject<Feature<?>> ZEDCO_STORE_FLIPPED = REGISTRY.register("zedco_store_flipped", ZedcoStoreFlippedFeature::new);
}


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
import net.mcreator.diabolica.world.features.StasisPoolsEntranceFeature;
import net.mcreator.diabolica.world.features.PoolZedcoFeature;
import net.mcreator.diabolica.world.features.PoolTowerFeature;
import net.mcreator.diabolica.world.features.PoolLampFeature;
import net.mcreator.diabolica.world.features.PoolAquaductFeature;
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
	public static final RegistryObject<Feature<?>> ZEDCO_STORE_FLIPPED = REGISTRY.register("zedco_store_flipped", ZedcoStoreFlippedFeature::new);
	public static final RegistryObject<Feature<?>> ZEDCO_STORE = REGISTRY.register("zedco_store", ZedcoStoreFeature::new);
	public static final RegistryObject<Feature<?>> POOL_LAMP = REGISTRY.register("pool_lamp", PoolLampFeature::new);
	public static final RegistryObject<Feature<?>> POOL_TOWER = REGISTRY.register("pool_tower", PoolTowerFeature::new);
	public static final RegistryObject<Feature<?>> POOL_AQUADUCT = REGISTRY.register("pool_aquaduct", PoolAquaductFeature::new);
	public static final RegistryObject<Feature<?>> POOL_ZEDCO = REGISTRY.register("pool_zedco", PoolZedcoFeature::new);
	public static final RegistryObject<Feature<?>> STASIS_POOLS_ENTRANCE = REGISTRY.register("stasis_pools_entrance", StasisPoolsEntranceFeature::new);
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.diabolica.DiabolicaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiabolicaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DiabolicaMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DiabolicaModBlocks.LIMINAL_ROAD.get().asItem());
			tabData.accept(DiabolicaModBlocks.STRIPED_LIMINAL_ROAD.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(DiabolicaModBlocks.DIABOLISM_TABLE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DiabolicaModItems.SOULSNATCHER.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(DiabolicaModItems.AUGMENTED_TEAR.get());
			tabData.accept(DiabolicaModItems.SCROLL.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DiabolicaModItems.DEVILS_CONTRACT.get());
			tabData.accept(DiabolicaModItems.ACCURSED_IDOL.get());
			tabData.accept(DiabolicaModItems.VOID_PARCEL.get());
			tabData.accept(DiabolicaModItems.SPELL_OF_DISCOMBOBULATION.get());
			tabData.accept(DiabolicaModItems.SPELL_OF_RECOMBOBULATION.get());
			tabData.accept(DiabolicaModItems.SPELL_OF_RECALL.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(DiabolicaModItems.CANNED_HUMMUS.get());
			tabData.accept(DiabolicaModItems.HUMMUS_SANDWICH.get());
		}
	}
}


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
			tabData.accept(DiabolicaModBlocks.PLASTER.get().asItem());
			tabData.accept(DiabolicaModBlocks.PLASTER_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.PLASTER_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.PLASTER_BRICKS.get().asItem());
			tabData.accept(DiabolicaModBlocks.PLASTER_BRICK_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.PLASTER_BRICK_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.TILES.get().asItem());
			tabData.accept(DiabolicaModBlocks.TILE_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.TILE_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_TILES.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_TILE_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_TILE_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.WHITE_TILES.get().asItem());
			tabData.accept(DiabolicaModBlocks.WHITE_TILE_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.WHITE_TILE_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_WHITE_TILES.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_WHITE_TILE_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_WHITE_TILE_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.BLACK_TILES.get().asItem());
			tabData.accept(DiabolicaModBlocks.BLACK_TILE_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.BLACK_TILE_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_BLACK_TILES.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_BLACK_TILE_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.DINGY_BLACK_TILE_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.SILLY_TILES.get().asItem());
			tabData.accept(DiabolicaModBlocks.SILLY_TILE_STAIRS.get().asItem());
			tabData.accept(DiabolicaModBlocks.SILLY_TILE_SLAB.get().asItem());
			tabData.accept(DiabolicaModBlocks.SILLY_PLASTER.get().asItem());
			tabData.accept(DiabolicaModBlocks.SILLY_STAR.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_A.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_B.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_C.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_D.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_E.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_F.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_G.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_H.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_I.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_J.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_K.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_L.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_M.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_N.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_O.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_P.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_Q.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_R.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_S.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_T.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_U.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_V.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_W.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_X.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_Y.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_Z.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_0.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_1.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_2.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_3.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_4.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_5.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_6.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_7.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_8.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_9.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_PERIOD.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_COMMA.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_DASH.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_EXCLAMATION.get().asItem());
			tabData.accept(DiabolicaModBlocks.FLUORESCENT_LIGHT_QUESTION.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(DiabolicaModBlocks.DIABOLISM_TABLE.get().asItem());
			tabData.accept(DiabolicaModBlocks.LIGHTBULB.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DiabolicaModItems.SOULSNATCHER_SCYTHE.get());
			tabData.accept(DiabolicaModItems.FUNNY_HAMMER.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(DiabolicaModItems.AUGMENTED_TEAR.get());
			tabData.accept(DiabolicaModItems.SCROLL.get());
			tabData.accept(DiabolicaModItems.MAGIC_SNIFFER_EGG.get());
			tabData.accept(DiabolicaModItems.SILLYITE.get());
			tabData.accept(DiabolicaModItems.LIMINAL_ASPHALT.get());
			tabData.accept(DiabolicaModItems.BABEL_CODEX.get());
			tabData.accept(DiabolicaModItems.SILLY_STAR_STICKER.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DiabolicaModItems.DEVILS_CONTRACT.get());
			tabData.accept(DiabolicaModItems.ACCURSED_IDOL.get());
			tabData.accept(DiabolicaModItems.VOID_PARCEL.get());
			tabData.accept(DiabolicaModItems.SPELL_OF_DISCOMBOBULATION.get());
			tabData.accept(DiabolicaModItems.SPELL_OF_RECOMBOBULATION.get());
			tabData.accept(DiabolicaModItems.SPELL_OF_RECALL.get());
			tabData.accept(DiabolicaModItems.SPELLOF_RESURRECTION.get());
			tabData.accept(DiabolicaModItems.POOL_WATER_BUCKET.get());
			tabData.accept(DiabolicaModItems.RING_OF_HASTE.get());
			tabData.accept(DiabolicaModItems.ZEE_AMULET.get());
			tabData.accept(DiabolicaModItems.CROWBAR.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(DiabolicaModItems.CANNED_HUMMUS.get());
			tabData.accept(DiabolicaModBlocks.HUMMUS_CAN.get().asItem());
			tabData.accept(DiabolicaModItems.HUMMUS_SANDWICH.get());
		}
	}
}

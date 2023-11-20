
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.diabolica.item.VoidParcelItem;
import net.mcreator.diabolica.item.SpellofResurrectionItem;
import net.mcreator.diabolica.item.SpellofDiscombobulationItem;
import net.mcreator.diabolica.item.SpellOfRecombobulationItem;
import net.mcreator.diabolica.item.SpellOfRecallItem;
import net.mcreator.diabolica.item.SoulsnatcherItem;
import net.mcreator.diabolica.item.SoulItem;
import net.mcreator.diabolica.item.ScrollItem;
import net.mcreator.diabolica.item.MysticCrystalItem;
import net.mcreator.diabolica.item.MagicSnifferEggItem;
import net.mcreator.diabolica.item.HummusSandwichItem;
import net.mcreator.diabolica.item.GubItem;
import net.mcreator.diabolica.item.EmptyidolItem;
import net.mcreator.diabolica.item.DevilsContractItemItem;
import net.mcreator.diabolica.item.CannedHummusItem;
import net.mcreator.diabolica.DiabolicaMod;

public class DiabolicaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DiabolicaMod.MODID);
	public static final RegistryObject<Item> DEVILS_CONTRACT = REGISTRY.register("devils_contract", () -> new DevilsContractItemItem());
	public static final RegistryObject<Item> ACCURSED_IDOL = REGISTRY.register("accursed_idol", () -> new GubItem());
	public static final RegistryObject<Item> LIMBO_BLOCK = block(DiabolicaModBlocks.LIMBO_BLOCK);
	public static final RegistryObject<Item> VOID_PARCEL = REGISTRY.register("void_parcel", () -> new VoidParcelItem());
	public static final RegistryObject<Item> SPELL_OF_DISCOMBOBULATION = REGISTRY.register("spell_of_discombobulation", () -> new SpellOfRecombobulationItem());
	public static final RegistryObject<Item> SOUL = REGISTRY.register("soul", () -> new SoulItem());
	public static final RegistryObject<Item> AUGMENTED_TEAR = REGISTRY.register("augmented_tear", () -> new MysticCrystalItem());
	public static final RegistryObject<Item> DIABOLISM_TABLE = block(DiabolicaModBlocks.DIABOLISM_TABLE);
	public static final RegistryObject<Item> SPELL_OF_RECOMBOBULATION = REGISTRY.register("spell_of_recombobulation", () -> new SpellofDiscombobulationItem());
	public static final RegistryObject<Item> EMPTY_ACCURSED_IDOL = REGISTRY.register("empty_accursed_idol", () -> new EmptyidolItem());
	public static final RegistryObject<Item> SOULSNATCHER = REGISTRY.register("soulsnatcher", () -> new SoulsnatcherItem());
	public static final RegistryObject<Item> SPELL_OF_RECALL = REGISTRY.register("spell_of_recall", () -> new SpellOfRecallItem());
	public static final RegistryObject<Item> SCROLL = REGISTRY.register("scroll", () -> new ScrollItem());
	public static final RegistryObject<Item> LIMINAL_ROAD = block(DiabolicaModBlocks.LIMINAL_ROAD);
	public static final RegistryObject<Item> STRIPED_LIMINAL_ROAD = block(DiabolicaModBlocks.STRIPED_LIMINAL_ROAD);
	public static final RegistryObject<Item> ROAD_PLACER = block(DiabolicaModBlocks.ROAD_PLACER);
	public static final RegistryObject<Item> ROAD_PLACER_2 = block(DiabolicaModBlocks.ROAD_PLACER_2);
	public static final RegistryObject<Item> CANNED_HUMMUS = REGISTRY.register("canned_hummus", () -> new CannedHummusItem());
	public static final RegistryObject<Item> HUMMUS_SANDWICH = REGISTRY.register("hummus_sandwich", () -> new HummusSandwichItem());
	public static final RegistryObject<Item> FLUORESCENT_LIGHT = block(DiabolicaModBlocks.FLUORESCENT_LIGHT);
	public static final RegistryObject<Item> MAGIC_SNIFFER_EGG = REGISTRY.register("magic_sniffer_egg", () -> new MagicSnifferEggItem());
	public static final RegistryObject<Item> PLASTER = block(DiabolicaModBlocks.PLASTER);
	public static final RegistryObject<Item> DINGY_TILES = block(DiabolicaModBlocks.DINGY_TILES);
	public static final RegistryObject<Item> SPELLOF_RESURRECTION = REGISTRY.register("spellof_resurrection", () -> new SpellofResurrectionItem());
	public static final RegistryObject<Item> TILES = block(DiabolicaModBlocks.TILES);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_A = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_A);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_B = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_B);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_C = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_C);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_D = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_D);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_E = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_E);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_F = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_F);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_G = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_G);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_H = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_H);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_I = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_I);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_J = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_J);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_K = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_K);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_L = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_L);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_M = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_M);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_N = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_N);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_O = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_O);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_P = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_P);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_Q = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_Q);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_R = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_R);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_S = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_S);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_T = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_T);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_U = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_U);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_V = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_V);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_W = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_W);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_X = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_X);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_Y = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_Y);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_Z = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_Z);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_0 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_0);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_1 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_1);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_2 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_2);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_3 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_3);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_4 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_4);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_5 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_5);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_6 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_6);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_7 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_7);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_8 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_8);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_9 = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_9);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_PERIOD = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_PERIOD);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_COMMA = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_COMMA);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_DASH = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_DASH);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_EXCLAMATION = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_EXCLAMATION);
	public static final RegistryObject<Item> FLUORESCENT_LIGHT_QUESTION = block(DiabolicaModBlocks.FLUORESCENT_LIGHT_QUESTION);
	public static final RegistryObject<Item> HUMMUS_CAN = block(DiabolicaModBlocks.HUMMUS_CAN);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

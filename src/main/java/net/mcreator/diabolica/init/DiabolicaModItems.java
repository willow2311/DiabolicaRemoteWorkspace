
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
import net.mcreator.diabolica.item.SpellofDiscombobulationItem;
import net.mcreator.diabolica.item.SpellOfRecombobulationItem;
import net.mcreator.diabolica.item.SpellOfRecallItem;
import net.mcreator.diabolica.item.SoulsnatcherItem;
import net.mcreator.diabolica.item.SoulItem;
import net.mcreator.diabolica.item.ScrollItem;
import net.mcreator.diabolica.item.MysticCrystalItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

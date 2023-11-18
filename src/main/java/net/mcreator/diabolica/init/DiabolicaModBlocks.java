
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.diabolica.block.LimboBlockBlock;
import net.mcreator.diabolica.block.EnhcancedCraftingTableBlock;
import net.mcreator.diabolica.DiabolicaMod;

public class DiabolicaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DiabolicaMod.MODID);
	public static final RegistryObject<Block> LIMBO_BLOCK = REGISTRY.register("limbo_block", () -> new LimboBlockBlock());
	public static final RegistryObject<Block> DIABOLISM_TABLE = REGISTRY.register("diabolism_table", () -> new EnhcancedCraftingTableBlock());
}

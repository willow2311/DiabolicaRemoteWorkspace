
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.diabolica.enchantment.LaunchingEnchantEnchantment;
import net.mcreator.diabolica.enchantment.LachrymoseEnchantment;
import net.mcreator.diabolica.DiabolicaMod;

public class DiabolicaModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, DiabolicaMod.MODID);
	public static final RegistryObject<Enchantment> LACHRYMOSE = REGISTRY.register("lachrymose", () -> new LachrymoseEnchantment());
	public static final RegistryObject<Enchantment> LAUNCHING_ENCHANT = REGISTRY.register("launching_enchant", () -> new LaunchingEnchantEnchantment());
}

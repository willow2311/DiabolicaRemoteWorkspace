
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.diabolica.world.inventory.EnhancedCraftGUIMenu;
import net.mcreator.diabolica.world.inventory.DevilsContractMenu;
import net.mcreator.diabolica.DiabolicaMod;

public class DiabolicaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DiabolicaMod.MODID);
	public static final RegistryObject<MenuType<DevilsContractMenu>> DEVILS_CONTRACT = REGISTRY.register("devils_contract", () -> IForgeMenuType.create(DevilsContractMenu::new));
	public static final RegistryObject<MenuType<EnhancedCraftGUIMenu>> ENHANCED_CRAFT_GUI = REGISTRY.register("enhanced_craft_gui", () -> IForgeMenuType.create(EnhancedCraftGUIMenu::new));
}

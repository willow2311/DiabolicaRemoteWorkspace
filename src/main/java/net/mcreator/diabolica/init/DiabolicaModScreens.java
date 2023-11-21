
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.diabolica.client.gui.EnhancedCraftGUIScreen;
import net.mcreator.diabolica.client.gui.EnchantedSatchelScreen;
import net.mcreator.diabolica.client.gui.DevilsContractScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DiabolicaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DiabolicaModMenus.DEVILS_CONTRACT.get(), DevilsContractScreen::new);
			MenuScreens.register(DiabolicaModMenus.ENHANCED_CRAFT_GUI.get(), EnhancedCraftGUIScreen::new);
			MenuScreens.register(DiabolicaModMenus.ENCHANTED_SATCHEL.get(), EnchantedSatchelScreen::new);
		});
	}
}

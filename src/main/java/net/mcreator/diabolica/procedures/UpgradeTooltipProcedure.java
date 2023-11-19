package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.diabolica.init.DiabolicaModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class UpgradeTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == DiabolicaModItems.AUGMENTED_TEAR.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A75An enchanted crystal with enhancing properties."));
			}
			if (Screen.hasAltDown()) {
				tooltip.add(Component.literal("\u00A75Combine with any item to upgrade it's rarity."));
				tooltip.add(Component.literal("\u00A75Shift right-click on a crafting table while holding to enhance it."));
			}
		}
	}
}

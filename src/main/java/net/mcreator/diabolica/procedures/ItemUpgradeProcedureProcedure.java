package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class ItemUpgradeProcedureProcedure {
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
		if (itemstack.getOrCreateTag().getDouble("level") == 1) {
			tooltip.add(Component.literal(" "));
			tooltip.add(Component.literal("\u00A7a\u00A7lUNCOMMON ITEM"));
		}
		if (itemstack.getOrCreateTag().getDouble("level") == 2) {
			tooltip.add(Component.literal(" "));
			tooltip.add(Component.literal("\u00A79\u00A7lRARE ITEM"));
		}
		if (itemstack.getOrCreateTag().getDouble("level") == 3) {
			tooltip.add(Component.literal(" "));
			tooltip.add(Component.literal("\u00A75\u00A7lEPIC ITEM"));
		}
		if (itemstack.getOrCreateTag().getDouble("level") == 4) {
			tooltip.add(Component.literal(" "));
			tooltip.add(Component.literal("\u00A76\u00A7lLEGENDARY ITEM"));
		}
		if (itemstack.getOrCreateTag().getDouble("level") == 5) {
			tooltip.add(Component.literal(" "));
			tooltip.add(Component.literal("\u00A7d\u00A7lUNIQUE ITEM"));
		}
		if (itemstack.getOrCreateTag().getDouble("level") > 5) {
			tooltip.add(Component.literal(" "));
			tooltip.add(Component.literal(("\u00A7d\u00A7lUNIQUE ITEM" + (" +" + (itemstack.getOrCreateTag().getDouble("level") - 5)))));
		}
	}
}

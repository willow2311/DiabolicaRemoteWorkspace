package net.mcreator.diabolica.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.diabolica.init.DiabolicaModItems;

public class RingSlotPlacementProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (!(itemstack.getItem() == DiabolicaModItems.RING_OF_HASTE.get())) {
			return true;
		}
		return false;
	}
}

package net.mcreator.diabolica.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AmuletSlotPlacementProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (!(itemstack.getItem() == DiabolicaModItems.RING_OF_HASTE.get())) {
			return true;
		}
		return false;
	}
}

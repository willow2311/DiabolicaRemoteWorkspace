package net.mcreator.diabolica.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.diabolica.init.DiabolicaModItems;

import java.util.function.Supplier;
import java.util.Map;

public class WhenRingSlotChangesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == DiabolicaModItems.RING_OF_HASTE.get()) {
			entity.getPersistentData().putBoolean("hasteRing", true);
		} else {
			entity.getPersistentData().putBoolean("hasteRing", false);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == DiabolicaModItems.ZEE_AMULET.get()) {
			entity.getPersistentData().putBoolean("zeeAmulet", true);
		} else {
			entity.getPersistentData().putBoolean("zeeAmulet", false);
		}
	}
}

package net.mcreator.diabolica.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.diabolica.network.DiabolicaModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class RemoveItemFromOutputProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(0)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(1)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(2)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		{
			boolean _setval = false;
			entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.yubgub = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

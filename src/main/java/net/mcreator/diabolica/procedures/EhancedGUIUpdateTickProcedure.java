package net.mcreator.diabolica.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.diabolica.network.DiabolicaModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class EhancedGUIUpdateTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).yubgub == false) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
		EraseThirdProcedure.execute(entity);
		AnythingRecipeProcedure.execute(entity);
		CraftRecomProcedure.execute(entity);
		CraftScrollProcedure.execute(entity);
		CraftRecallProcedure.execute(entity);
		CraftDecombProcedure.execute(entity);
		CraftIdolProcedure.execute(entity);
	}
}

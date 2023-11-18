package net.mcreator.diabolica.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.diabolica.network.DiabolicaModVariables;

public class ColorRarityTrueProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.colorRarityNames = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

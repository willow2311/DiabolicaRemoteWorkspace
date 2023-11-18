package net.mcreator.diabolica.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.diabolica.network.DiabolicaModVariables;

public class PlayerJoinsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).spawn_x == 0
				&& (entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).spawn_y == 0
				&& (entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DiabolicaModVariables.PlayerVariables())).spawn_z == 0) {
			{
				double _setval = world.getLevelData().getXSpawn();
				entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.spawn_x = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = world.getLevelData().getYSpawn();
				entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.spawn_y = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = world.getLevelData().getZSpawn();
				entity.getCapability(DiabolicaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.spawn_z = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

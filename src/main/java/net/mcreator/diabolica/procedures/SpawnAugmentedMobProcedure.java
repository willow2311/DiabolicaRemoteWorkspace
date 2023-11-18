package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.diabolica.network.DiabolicaModVariables;
import net.mcreator.diabolica.init.DiabolicaModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnAugmentedMobProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (DiabolicaModVariables.MapVariables.get(world).dragon_killed == true) {
			if (Math.random() < 0.05) {
				if (entity instanceof Monster) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(DiabolicaModMobEffects.AUGMENTED.get(), -1, 1, false, true));
				}
			}
		}
	}
}

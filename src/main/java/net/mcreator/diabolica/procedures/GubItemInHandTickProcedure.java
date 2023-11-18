package net.mcreator.diabolica.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.diabolica.init.DiabolicaModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GubItemInHandTickProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		execute(null, world, x, y, z, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DiabolicaModItems.ACCURSED_IDOL.get()) {
			if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(1);
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				GuProcedure.execute(world, x, y, z, entity);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == DiabolicaModItems.ACCURSED_IDOL.get()) {
			if (amount >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(1);
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				GuProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}

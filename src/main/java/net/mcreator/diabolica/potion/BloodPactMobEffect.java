
package net.mcreator.diabolica.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.diabolica.procedures.BloodPactEffectStartedappliedProcedure;
import net.mcreator.diabolica.procedures.BloodPactEffectExpiresProcedure;
import net.mcreator.diabolica.procedures.BloodPactActiveTickConditionProcedure;

public class BloodPactMobEffect extends MobEffect {
	public BloodPactMobEffect() {
		super(MobEffectCategory.NEUTRAL, -11532023);
	}

	@Override
	public String getDescriptionId() {
		return "effect.diabolica.blood_pact";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		BloodPactEffectStartedappliedProcedure.execute(entity.level(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BloodPactActiveTickConditionProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		BloodPactEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

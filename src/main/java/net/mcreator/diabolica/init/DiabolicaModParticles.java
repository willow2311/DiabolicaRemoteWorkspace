
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diabolica.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.diabolica.client.particle.RedBoomParticle;
import net.mcreator.diabolica.client.particle.EvilParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DiabolicaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(DiabolicaModParticleTypes.RED_BOOM.get(), RedBoomParticle::provider);
		event.registerSpriteSet(DiabolicaModParticleTypes.EVIL_PARTICLE.get(), EvilParticleParticle::provider);
	}
}

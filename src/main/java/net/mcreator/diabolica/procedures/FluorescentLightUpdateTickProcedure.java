package net.mcreator.diabolica.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FluorescentLightUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diabolica:block.fluorescent_light.buzz")), SoundSource.BLOCKS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diabolica:block.fluorescent_light.buzz")), SoundSource.BLOCKS, 1, 1, false);
			}
		}
	}
}

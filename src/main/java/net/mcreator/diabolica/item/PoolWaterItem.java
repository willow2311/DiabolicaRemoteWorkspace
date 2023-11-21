
package net.mcreator.diabolica.item;

import net.minecraft.network.chat.Component;

public class PoolWaterItem extends BucketItem {

	public PoolWaterItem() {
		super(DiabolicaModFluids.POOL_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

}


package net.mcreator.diabolica.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.diabolica.init.DiabolicaModFluids;

public class PoolWaterItem extends BucketItem {
	public PoolWaterItem() {
		super(DiabolicaModFluids.POOL_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}

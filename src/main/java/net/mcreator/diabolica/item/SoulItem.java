
package net.mcreator.diabolica.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SoulItem extends Item {
	public SoulItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

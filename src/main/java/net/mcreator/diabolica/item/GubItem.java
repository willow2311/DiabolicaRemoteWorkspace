
package net.mcreator.diabolica.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GubItem extends Item {
	public GubItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}


package net.mcreator.diabolica.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LiminalAsphaltItem extends Item {
	public LiminalAsphaltItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}
}

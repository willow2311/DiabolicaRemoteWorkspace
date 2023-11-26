
package net.mcreator.diabolica.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BabelCodexItem extends Item {
	public BabelCodexItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}
}

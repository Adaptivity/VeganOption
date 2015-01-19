package squeek.veganoption.integration.twilightforest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import squeek.veganoption.content.registry.CompostRegistry;
import squeek.veganoption.content.registry.CompostRegistry.FoodSpecifier;
import squeek.veganoption.integration.IntegratorBase;

public class TwilightForest extends IntegratorBase
{
	@Override
	public void init()
	{
		super.init();

		CompostRegistry.blacklist(new FoodSpecifier()
		{
			private final Set<String> itemNameBlacklist = new HashSet<String>(
					Arrays.asList(
							fullItemName("item.meefStroganoff")
							)
					);

			@Override
			public boolean matches(ItemStack itemStack)
			{
				String itemName = Item.itemRegistry.getNameForObject(itemStack.getItem());
				return itemNameBlacklist.contains(itemName);
			}
		});
	}
}

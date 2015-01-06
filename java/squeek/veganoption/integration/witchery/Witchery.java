package squeek.veganoption.integration.witchery;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import squeek.veganoption.content.ContentHelper;
import squeek.veganoption.integration.IIntegrator;
import squeek.veganoption.integration.IntegrationHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class Witchery implements IIntegrator
{
	public static final int woodAshMetadata = 18;

	@Override
	public void overrideContent()
	{
	}

	@Override
	public void preInit()
	{
	}

	@Override
	public void init()
	{
		Item ingredient = GameRegistry.findItem(IntegrationHandler.MODID_WITCHERY, "ingredient");
		if (ingredient != null)
		{
			ItemStack woodAsh = new ItemStack(ingredient, 1, woodAshMetadata);
			OreDictionary.registerOre(ContentHelper.woodAshOreDict, woodAsh);
		}
	}

	@Override
	public void postInit()
	{
	}
}

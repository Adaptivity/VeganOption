package squeek.veganoption.content;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class ContentHelper
{
	// helper itemstacks for vanilla stuff
	public static final ItemStack charcoal = new ItemStack(Items.coal, 1, 1);

	// oredict
	public static final String leatherOreDict = "materialLeather";
	public static final String woolOreDict = "materialBedding";
	public static final String featherOreDict = "materialFeather";
	public static final String bastFibreOreDict = "materialFiber";
	public static final String milkOreDict = "listAllmilk"; // HarvestCraft's oredict entry
	public static final String eggOreDict = "listAllegg"; // HarvestCraft's oredict entry
	public static final String slimeballOreDict = "slimeball"; // Forge's oredict entry
	public static final String vegetableOilOreDict = "foodOliveoil"; // HarvestCraft's oredict entry
	public static final String waxOreDict = "materialWax";
	public static final String waxOreDictForestry = "itemBeeswax";
	public static final String inkSacOreDict = "dyeBlack"; // Forge's oredict entry
	public static final String brownDyeOreDict = "dyeBrown"; // Forge's oredict entry
	public static final String plasticOreDict = "sheetPlastic"; // MFR's oredict entry
	public static final String plasticRodOreDict = "stickPlastic";
	public static final String rottenOreDict = "materialRotten";
	public static final String fertilizerOreDict = "fertilizerOrganic"; // IC2's oredict entry
	public static final String pufferFishOreDict = "reagentWaterBreathing";
	public static final String soapOreDict = "soap";
	public static final String poisonousOreDict = "reagentPoisonous";
	public static final String fermentedOreDict = "reagentFermented";
	public static final String sulfurOreDict = "dustSulfur"; // This is what other mods use
	public static final String saltpeterOreDict = "dustSaltpeter"; // This is what other mods use
	public static final String stickOreDict = "stickWood"; // Forge's oredict entry
	public static final String leavesOreDict = "treeLeaves"; // Forge's oredict entry
	public static final String saplingOreDict = "treeSapling"; // Forge's oredict entry
	public static final String sawDustOreDict = "pulpWood"; // Mekanism's oredict entry
	public static final String sawDustAltOreDict = "dustWood"; // TE's oredict entry
	public static final String woodAshOreDict = "ashWood";
	public static final String blackPigmentOreDict = "pigmentBlack";
	public static final String woodPlankOreDict = "plankWood"; // Forge's oredict entry
	public static final String rosinOreDict = "materialRosin";
	public static final String starchOreDict = "starch";
	public static final String kapokOreDict = "materialFluffy";
	public static final String sunflowerSeedOreDict = "cropSunflower"; // HarvestCraft's oredict entry
	public static final String oilPresserOreDict = "presserOil";
	public static final String vegetableOilSourceOreDict = "sourceVegetableOil";

	// various vegetable oil sources from other mods
	public static final String grapeSeedOreDict = "seedGrape";
	public static final String soybeanOreDict = "cropSoybean";
	public static final String cottonSeedOreDict = "seedCotton";
	public static final String coconutOreDict = "cropCoconut";
	public static final String oliveOreDict = "cropOlive";
	public static final String cornOreDict = "cropCorn";
	public static final String nutOreDict = "listAllnut";
	public static final String teaSeedOreDict = "seedTea";
	public static final String avocadoOreDict = "cropAvocado";

	public static void addOreSmelting(String inputOreName, ItemStack output, float xp)
	{
		for (ItemStack ore : OreDictionary.getOres(inputOreName))
		{
			GameRegistry.addSmelting(ore.copy(), output, 0.2f);
		}
	}

	public static void remapOre(String from, String to)
	{
		for (ItemStack ore : OreDictionary.getOres(from))
		{
			OreDictionary.registerOre(to, ore.copy());
		}
	}
}

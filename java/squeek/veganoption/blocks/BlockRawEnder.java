package squeek.veganoption.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;
import squeek.veganoption.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRawEnder extends BlockFluidFinite
{
	@SideOnly(Side.CLIENT)
	protected IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon flowIcon;

	public static Material materialRawEnder = Material.water;

	public BlockRawEnder(Fluid fluid)
	{
		super(fluid, materialRawEnder);
	}

	@Override
	public IIcon getIcon(int side, int meta)
	{
		return (side == 0 || side == 1) ? stillIcon : flowIcon;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register)
	{
		stillIcon = register.registerIcon(ModInfo.MODID_LOWER + ":" + "raw_ender_still");
		flowIcon = register.registerIcon(ModInfo.MODID_LOWER + ":" + "raw_ender_flow");
		getFluid().setIcons(stillIcon, flowIcon);
	}

	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z)
	{
		//if (world.getBlock(x, y, z).getMaterial().isLiquid())
		//	return false;
		return super.canDisplace(world, x, y, z);
	}

	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z)
	{
		//if (world.getBlock(x, y, z).getMaterial().isLiquid())
		//	return false;
		return super.displaceIfPossible(world, x, y, z);
	}
}

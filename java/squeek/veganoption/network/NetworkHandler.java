package squeek.veganoption.network;

import squeek.veganoption.ModInfo;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class NetworkHandler
{
	public static final SimpleNetworkWrapper channel = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.MODID);

	public static void init()
	{
		channel.registerMessage(MessageFX.class, MessageFX.class, 0, Side.CLIENT);
		channel.registerMessage(MessageComposterTumble.class, MessageComposterTumble.class, 1, Side.SERVER);
	}
}

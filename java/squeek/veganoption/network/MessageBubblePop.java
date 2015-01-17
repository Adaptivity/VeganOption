package squeek.veganoption.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityBreakingFX;
import squeek.veganoption.content.modules.FrozenBubble;
import squeek.veganoption.helpers.NetworkHelper;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MessageBubblePop implements IMessage, IMessageHandler<MessageBubblePop, IMessage>
{
	double x, y, z;

	public MessageBubblePop()
	{
	}

	public MessageBubblePop(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeDouble(x);
		buf.writeDouble(y);
		buf.writeDouble(z);
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		this.x = buf.readDouble();
		this.y = buf.readDouble();
		this.z = buf.readDouble();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IMessage onMessage(MessageBubblePop message, MessageContext ctx)
	{
		Minecraft mc = Minecraft.getMinecraft();
		for (int i = 0; i < 8; ++i)
		{
			mc.effectRenderer.addEffect(new EntityBreakingFX(NetworkHelper.getSidedWorld(ctx), message.x, message.y, message.z, FrozenBubble.frozenBubble));
		}
		return null;
	}
}

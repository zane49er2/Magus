package com.zane49er.magus.handlers;

import com.zane49er.magus.main.References;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		//if(ID == References.GUI_WRITING) return new ContainerAssembler(player.inventory, (TileEntityAssembler)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		//if(ID == References.GUI_WRITING) return new GuiAssembler(player.inventory, (TileEntityAssembler)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}

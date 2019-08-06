package com.zane49er.magus.features.items.trinkets;

import java.util.List;

import com.zane49er.magus.handlers.TabHandler;
import com.zane49er.magus.init.ModItems;
import com.zane49er.magus.main.Magus;
import com.zane49er.magus.main.References;
import com.zane49er.magus.util.IHasModel;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Bell extends Item implements IHasModel {

	public Bell() {
		setRegistryName("bell");
		setCreativeTab(TabHandler.tabUseful);
		setHasSubtypes(true);
		setMaxStackSize(1);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Magus.proxy.registerItemRender(this, 0, "inventory");
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		if (stack.hasTagCompound()) {
			NBTTagCompound itemData = stack.getTagCompound();
			if (itemData.hasKey("level") && itemData.hasKey("modifier")) {
				return "item.bell" + itemData.getString("level") + itemData.getString("modifier");
			}
		}
		stack.setTagCompound(new NBTTagCompound());
		stack.getTagCompound().setString("level", "_");
		stack.getTagCompound().setString("modifier", "basic");
		return "item.bell1_basic";
	}

	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> itemList) {
		if (this.isInCreativeTab(tab)) {
			for (int pos = 0; pos < References.MODIFIER_MATS.length; pos++) {
				ItemStack bellStack = new ItemStack(this);
				bellStack.setTagCompound(new NBTTagCompound());
				bellStack.getTagCompound().setString("modifier", References.MODIFIER_MATS[pos]);
				bellStack.getTagCompound().setString("level", "1_");
				itemList.add(bellStack.copy());
				bellStack.getTagCompound().setString("level", "2_");
				itemList.add(bellStack);
			}
		}
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (stack.hasTagCompound()) {
			NBTTagCompound itemData = stack.getTagCompound();
			if (itemData.hasKey("modifier")) {
				tooltip.add(itemData.getString("modifier"));
			}
		}
	}
}

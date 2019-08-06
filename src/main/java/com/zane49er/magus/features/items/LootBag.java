package com.zane49er.magus.features.items;

import java.util.List;

import com.zane49er.magus.handlers.TabHandler;
import com.zane49er.magus.init.ModItems;
import com.zane49er.magus.main.Magus;
import com.zane49er.magus.main.References;
import com.zane49er.magus.util.IHasModel;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class LootBag extends Item implements IHasModel {

	public LootBag() {
		setUnlocalizedName("lootbag");
		setRegistryName("lootbag");
		setCreativeTab(TabHandler.tabUseful);
		setHasSubtypes(true);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Magus.proxy.registerItemRender(this, 0, "lootbag_0");
		Magus.proxy.registerItemRender(this, 1, "lootbag_1");
		Magus.proxy.registerItemRender(this, 2, "lootbag_2");
		Magus.proxy.registerItemRender(this, 3, "lootbag_3");
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item.lootbag" + stack.getMetadata();
	}
	
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> itemList) {
		if (this.isInCreativeTab(tab)) {
			itemList.add(new ItemStack(this, 1, 0));
			itemList.add(new ItemStack(this, 1, 1));
			itemList.add(new ItemStack(this, 1, 2));
			itemList.add(new ItemStack(this, 1, 3));
		}
	}
}
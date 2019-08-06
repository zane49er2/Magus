package com.zane49er.magus.features.items;

import com.zane49er.magus.handlers.TabHandler;
import com.zane49er.magus.init.ModItems;
import com.zane49er.magus.main.Magus;
import com.zane49er.magus.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class SpellPage extends Item implements IHasModel {
	
	public SpellPage() {
		setUnlocalizedName("spell_page");
		setRegistryName("spell_page");
		setCreativeTab(TabHandler.tabBasic);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Magus.proxy.registerItemRender(this, 0, "inventory");
	}
}

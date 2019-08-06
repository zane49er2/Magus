package com.zane49er.magus.features.items;

import com.zane49er.magus.init.ModItems;
import com.zane49er.magus.main.Magus;
import com.zane49er.magus.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(TabHandler.tabResources);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Magus.proxy.registerItemRender(this, 0, "inventory");
	}
	
}

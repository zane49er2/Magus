package com.zane49er.magus.handlers;

import com.zane49er.magus.init.ModBlocks;
import com.zane49er.magus.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabHandler {

	public static CreativeTabs tabUseful = new CreativeTabs("TabUseful") {
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.TRINKET_BELL);
		}
	};
	
	public static CreativeTabs tabBasic = new CreativeTabs("TabBasic") {
		public ItemStack getTabIconItem() {
			//return new ItemStack(ModBlocks.ASSEMBLER);
			return new ItemStack(ModItems.TORN_PAGE);
		}
	};
}

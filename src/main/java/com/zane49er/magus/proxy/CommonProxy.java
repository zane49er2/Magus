package com.zane49er.magus.proxy;

import com.zane49er.magus.init.ModItems;
import com.zane49er.magus.main.References;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class CommonProxy {

	public void registerItemRender(Item item, int meta, String id) {

	}

	public void registerModelBakeryVariants() {
		ModelBakery.registerItemVariants(ModItems.LOOTBAG,
				new ResourceLocation(References.MOD_ID, "lootbag1"),
				new ResourceLocation(References.MOD_ID, "lootbag2"),
				new ResourceLocation(References.MOD_ID, "lootbag3"),
				new ResourceLocation(References.MOD_ID, "lootbag4"));
	}

}

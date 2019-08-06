package com.zane49er.magus.init;

import java.util.List;

import com.zane49er.magus.features.items.LootBag;
import com.zane49er.magus.features.items.SpellPage;
import com.zane49er.magus.features.items.TornPage;
import com.zane49er.magus.features.items.trinkets.Bell;

import java.util.ArrayList;

import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item SPELL_PAGE = new SpellPage();
	public static final Item TORN_PAGE = new TornPage();
	public static final Item LOOTBAG = new LootBag();

	public static final Item TRINKET_BELL = new Bell();

}

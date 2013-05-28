package gildedrose.strategy;

import gildedrose.inheritance.AgedBrie;
import gildedrose.inheritance.BackstagPasses;
import gildedrose.inheritance.Conjured;
import gildedrose.inheritance.ItemWithBehaviour;
import gildedrose.inheritance.ItemWithNoBehaviour;
import gildedrose.original.Item;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

	/*
	 * minimal addition to ensure testability
	 */
	public static void setItems(List<Item> items) {
		GildedRose.items = items;
	}

	private static List<Item> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("OMGHAI!");

		items = new ArrayList<Item>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));

		updateQuality();
	}

	public static void updateQuality() {
		for (Item item : items) {
			getUpdateStrategyForItem(item).update(item);
		}
	}

	public static UpdateStrategy getUpdateStrategyForItem(Item item) {
		if (item.name.contains("Conjured"))
			return new UpdateConjured();
		if (item.name.contains("Backstage passes to a TAFKAL80ETC concert"))
			return new UpdateBackstagePasses();
		if (item.name.contains("Sulfuras, Hand of Ragnaros"))
			return new UpdateNothing();
		if (item.name.contains("Aged Brie"))
			return new UpdateAgedBrie();
		return new UpdateStrategy();
	}

}
package gildedrose.inheritance;

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
		for (Item item : items)
			((ItemWithBehaviour)item).updateQuality();
	}

	public static ItemWithBehaviour createItem(String name, int sellIn, int quality) {
		if (name.contains("Conjured"))
			return new Conjured (name,sellIn, quality);
		if (name.contains("Backstage passes to a TAFKAL80ETC concert"))
			return new BackstagPasses (name,sellIn,quality);
		if (name.contains("Sulfuras, Hand of Ragnaros"))
			return new ItemWithNoBehaviour(name,sellIn,quality);
		if (name.contains("Aged Brie"))
			return new AgedBrie(name,sellIn,quality);
		return new ItemWithBehaviour(name,sellIn,quality);

	}

}
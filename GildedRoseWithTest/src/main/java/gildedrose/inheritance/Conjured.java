package gildedrose.inheritance;

public class Conjured extends ItemWithBehaviour {
	public Conjured(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	public void updateQuality() {
		sellIn--;
		if (sellIn <= 0)
			quality = quality -4;
		else
			quality = quality -2;
		quality = capQuality(quality);
	}
	

}

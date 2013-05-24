package gildedrose.inheritance;

public class AgedBrie extends ItemWithBehaviour {
	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		sellIn--;
		if (sellIn <= 0)
			quality = quality +2;
		else
			quality++;
		
		quality = capQuality(quality);
	}
}

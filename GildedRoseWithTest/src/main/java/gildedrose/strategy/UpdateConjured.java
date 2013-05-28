package gildedrose.strategy;

public class UpdateConjured extends UpdateStrategy{
	public int calculateNewQuality(int quality, int sellIn) {
		if (sellIn <= 0)
			quality = quality -4;
		else
			quality = quality -2;
		quality = capQuality(quality);
		return quality;
	}
}

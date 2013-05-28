package gildedrose.strategy;

public class UpdateBackstagePasses extends UpdateStrategy {

	public int calculateNewQuality(int quality, int sellIn) {
		if (sellIn > 0){
			if (sellIn < 5)
				quality = quality +3;
			else if (sellIn < 10)
				quality = quality +2;
			else if (sellIn >= 10)
				quality++;
		} else quality = 0;
		quality = capQuality(quality);
		return quality;
	}
}

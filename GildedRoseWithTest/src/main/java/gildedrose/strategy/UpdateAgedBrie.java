package gildedrose.strategy;

public class UpdateAgedBrie extends UpdateStrategy{
	
	
	public int calculateNewQuality(int quality, int sellIn) {
		if (sellIn < 0)
			quality =  quality+2;
		else
			quality =  quality+1;
		quality = capQuality(quality);
		return quality;
	}	
}

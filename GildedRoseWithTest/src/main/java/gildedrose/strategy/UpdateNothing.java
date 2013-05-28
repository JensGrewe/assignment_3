package gildedrose.strategy;

public class UpdateNothing extends UpdateStrategy{
	public int calculateNewQuality(int quality, int sellIn) {
		return quality;
	}
	public int calculateNewSellIn(int oldSellIn){
		return oldSellIn;
	}
}

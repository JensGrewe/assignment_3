package gildedrose.strategy;

import gildedrose.original.Item;

public class UpdateStrategy {
    /**
     * update strategy for regular items, incomplete implementation.
     * this method has to be overwritten by subclasses/other strategies.
     * @param item
     */
	public void update(Item item) {
		int quality = item.getQuality();
		int sellIn = item.getSellIn();
		sellIn = calculateNewSellIn(sellIn);
		quality = calculateNewQuality(quality,sellIn);
		item.setQuality(quality);
		item.setSellIn(sellIn);	
	}
	
	
	public int calculateNewQuality(int quality, int sellIn) {
		if (sellIn < 0)
			quality =  quality-2;
		else
			quality =  quality-1;
		quality = capQuality(quality);
		return quality;
	}
	public int calculateNewSellIn(int oldSellIn){
		return oldSellIn-1;
	}

	public int capQuality(int myQuality){
		myQuality =  myQuality < 0 ? 0 : myQuality;
		myQuality = myQuality > 50 ? 50 : myQuality;
		return myQuality;
	}

}

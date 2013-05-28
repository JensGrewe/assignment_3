package gildedrose.inheritance;

public class BackstagPasses extends ItemWithBehaviour {
	public BackstagPasses(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	public void updateQuality() {
		sellIn--;
		if (sellIn > 0){
			if (sellIn < 5)
				quality = quality +3;
			else if (sellIn < 10)
				quality = quality +2;
			else if (sellIn >= 10)
				quality++;
		} else quality = 0;
		
		quality = capQuality(quality);
	}
	
}
//"Backstage passes", like aged brie, increases in Quality as it's SellIn value approaches; 
//Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or 
//less but Quality drops to 0 after the concert
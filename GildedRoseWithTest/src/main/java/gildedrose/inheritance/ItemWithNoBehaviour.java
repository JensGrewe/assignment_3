package gildedrose.inheritance;

public class ItemWithNoBehaviour extends ItemWithBehaviour{
	public ItemWithNoBehaviour(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	public void updateQuality() {
		// nothing happens
	}		
}

package gameEncounter;

public class Item {
	private int weight;
	private int price;
	private int category;
	//1: Hand1  //2: Hand2  //3: BiHand //4: Armor
	
	public void mod(Hero hero) {
		//apply modifiers granated by the item
	}
	public Item() {
		super();
	}
	public void demod(Hero hero) {
		//remove modifiers granted by the item
	}
	public String toString() {
		return "item";
		
	}
}

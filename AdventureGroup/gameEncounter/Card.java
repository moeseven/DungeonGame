package gameEncounter;

public class Card {
	protected int manaCost;
	private String type;
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public boolean playCard(Hero self){
		if(self.getMana()>manaCost) {
			self.setMana(self.getMana()-manaCost);
			this.applyEffect(self);
			self.getHand().remove(this);
			self.getDrawPile().add(this);
			return true;
		}else {
			return false;
		}
	}
	public void applyEffect(Hero self) {
		//here happens the magic
	}
	public String toString() {
		return "card";
		
	}
}

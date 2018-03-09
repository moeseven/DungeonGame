package gameEncounter.CardLibrary;

import gameEncounter.Card;
import gameEncounter.Hero;

public class Block extends Card{
	public Block() {
		// TODO Auto-generated constructor stub
		manaCost =1;
		
	}
	public void applyEffect(Hero self) {
		self.blockWithBonus(15);
	}
	public String toString() {
		return "parry";
		
	}
}

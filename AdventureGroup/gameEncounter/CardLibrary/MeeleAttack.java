package gameEncounter.CardLibrary;

import gameEncounter.Card;
import gameEncounter.Hero;

public class MeeleAttack extends Card{
	public MeeleAttack() {
		// TODO Auto-generated constructor stub
		manaCost =1;
		
	}
	public void applyEffect(Hero self) {
		self.dealDamage(self.getTarget(), 4);
	}
	public String toString() {
		return "meele attack";
		
	}
}
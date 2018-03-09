package gameEncounter.ItemLibrary;

import gameEncounter.Equipment;
import gameEncounter.Hero;
import gameEncounter.Item;

public class ArmorThinLeather extends Item{

	@Override
	public void mod(Hero hero) {
		hero.setTurnBlock(hero.getTurnBlock()+1);
	}

	@Override
	public void demod(Hero hero) {
		hero.setTurnBlock(hero.getTurnBlock()-1);
	}

	@Override
	public String toString() {
		return "Thin Leather";
	}

	@Override
	public boolean equip(Equipment e) {
		e.equipArmor(this);
		return false;
	}

	@Override
	public boolean unequip(Equipment e) {
		// TODO Auto-generated method stub
		return false;
	}

}

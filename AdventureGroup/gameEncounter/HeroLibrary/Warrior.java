package gameEncounter.HeroLibrary;

import java.util.LinkedList;

import gameEncounter.Card;
import gameEncounter.Deck;
import gameEncounter.Hero;
import gameEncounter.CardLibrary.Block;
import gameEncounter.CardLibrary.MeeleAttack;

public class Warrior extends Hero{

	public Warrior() {
		// TODO Auto-generated constructor stub
		turnBlock=0;
		turnMana=3;
		turnDraw=5;
		maxHp=100;
		hp=maxHp;
		//deck
		deck=new Deck();
		for (int i=0; i<5;i++) {
			deck.addCard(new MeeleAttack());
		}
		for (int i=0; i<5;i++) {
			deck.addCard(new Block());
		}
	}

}

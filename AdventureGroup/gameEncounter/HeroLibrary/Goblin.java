package gameEncounter.HeroLibrary;

import java.util.LinkedList;

import gameEncounter.Card;
import gameEncounter.Deck;
import gameEncounter.Hero;
import gameEncounter.CardLibrary.Block;
import gameEncounter.CardLibrary.MeeleAttack;

public class Goblin extends Hero{

	public Goblin() {
		// TODO Auto-generated constructor stub
		this.initialize();
		turnBlock=0;
		turnMana=2;
		turnDraw=3;
		maxHp=(int) Math.random()*100;
		hp=maxHp;
		gold=(int)Math.random()*5;
		//deck
		deck=new Deck();
		for (int i=0; i<4;i++) {
			deck.addCard(new MeeleAttack());
		}
		for (int i=0; i<3;i++) {
			deck.addCard(new Block());
		}
	}

}

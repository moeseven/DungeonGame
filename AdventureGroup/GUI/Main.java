package GUI;

import java.util.LinkedList;

import game.Game;
import game.RoomLibrary.GoblinRoom1;
import gameEncounter.Hero;
import gameEncounter.HeroLibrary.Warrior;

public class Main {
	public static LinkedList<Hero> heroes;
	public static void main(String[] args) {
		heroes= new LinkedList<Hero>();
		heroes.add(new Warrior());
		Game game = new Game(heroes);
		game.setRoom(new GoblinRoom1(heroes));
		new GameWindow();
	}

}

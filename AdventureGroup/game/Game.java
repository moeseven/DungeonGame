package game;

import java.util.LinkedList;

import gameEncounter.Fight;
import gameEncounter.Hero;

public class Game {
private LinkedList<Hero> heroes;
private Fight fight;
private Room room;
public Game(LinkedList<Hero> heroes) {
	super();
	this.heroes = heroes;
}
//getters and setters
public LinkedList<Hero> getHeroes() {
	return heroes;
}
public void setHeroes(LinkedList<Hero> heroes) {
	this.heroes = heroes;
}
public Fight getFight() {
	return fight;
}
public void setFight(Fight fight) {
	this.fight = fight;
}
public Room getRoom() {
	return room;
}
public void setRoom(Room room) {
	this.room = room;
}

}

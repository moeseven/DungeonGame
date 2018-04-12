package game;

import gameEncounter.Card;
import gameEncounter.Hero;

public class Player {
	private Hero selectedHero;
	public Player(Game game) {
		selectedHero=game.getHeroes().getFirst();
	}
	public Hero getSelectedHero() {
		return selectedHero;
	}
	public void setSelectedHero(Hero selectedHero) {
		this.selectedHero = selectedHero;
	}
	
}

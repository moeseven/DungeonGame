package gameEncounter;

import java.util.LinkedList;

public class Fight {
	private LinkedList<Hero> monsters;
	private LinkedList<Hero> heroes;
	private LinkedList<LinkedList<Hero>> meele;
	public Fight(LinkedList<Hero> attackers, LinkedList<Hero> defenders) {
		// TODO Auto-generated constructor stub
		attackers=this.monsters;
		defenders=this.heroes;
		for (Hero h : heroes) {
			
		    h.setUpDrawPile();
		}
	}
	public void createMeele() {
		if(monsters.size()>=heroes.size()) {
			for (int i=0; i<heroes.size();i++) {
				LinkedList<Hero> newList =new LinkedList<Hero>();
				newList.add(heroes.get(i));
				meele.add(newList);
			}
			for (int i=0; i<monsters.size();i++) {
				meele.get(i % heroes.size()).add(monsters.get(i));
			}
			
		}else {
			for (int i=0; i<monsters.size();i++) {
				LinkedList<Hero> newList =new LinkedList<Hero>();
				newList.add(monsters.get(i));
				meele.add(newList);
			}
			for (int i=0; i<heroes.size();i++) {
				meele.get(i % monsters.size()).add(heroes.get(i));
			}
		}
	}
}

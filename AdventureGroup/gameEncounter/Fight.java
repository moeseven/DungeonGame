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
		    h.setUpHandPile();
		}
		for (Hero m : monsters) {	
		    m.setUpHandPile();
		    m.turnBegin();		  
		}
	}
	public void determineBeginner() {
		if(Math.random()<0.5) {
			heroesTurn();
		}else {
			monstersTurn();
		}
	}
	public void heroesTurn() {		
		for (Hero h : heroes) {		
			h.turnBegin();
		}	
	}
	public void monstersTurn() {	
		for (Hero m: monsters) {
			m.turnBegin();
			m.setTarget(heroes.get((int) Math.round(Math.random()*(heroes.size()-1))));//choose target for attacks
		    m.turnBegin();//draw cards and reset buffs/debuffs
		    for(int i=0; i<m.getHand().size(); i++){
		    	if(m.getHand().get(i).playCard(m)) {
		    		i=i-1;
		    	}
		    }
		}	
		heroesTurn();
	}
	public void createMeele() {//give heroes a foe not good like this!
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

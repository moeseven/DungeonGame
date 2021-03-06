package gameEncounter;

import java.util.LinkedList;

public class Fight {
	private LinkedList<Hero> monsters;
	private LinkedList<Hero> heroes;
	private LinkedList<LinkedList<Hero>> meele;
	public Fight(LinkedList<Hero> monsters, LinkedList<Hero> heroes) {
		// TODO Auto-generated constructor stub
		this.monsters=monsters;
		this.heroes=heroes;
		for (Hero h : this.heroes) {		
		    h.setUpHandPile();
		}
		for (Hero m : this.monsters) {	
		    m.setUpHandPile();	  
		}
		this.determineBeginner();
	}
	public void determineBeginner() {
		for (Hero h : heroes) {		
			h.setTarget(monsters.get((int) Math.round(Math.random()*(monsters.size()-1))));
		}
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
		this.isFightOver();
		for (Hero m: monsters) {
			if(m.isDead()) {
				//don't participate in fight
			}else {
				m.turnBegin();//draw cards and reset buffs/debuffs
				m.setTarget(heroes.get((int) Math.round(Math.random()*(heroes.size()-1))));//choose target for attacks
			    for(int i=0; i<m.getHand().size(); i++){
			    	if(m.getHand().get(i).playCard(m)) {
			    		i=i-1;
			    	}
			    }
			}			
		}	
		if (this.isFightOver()) {
			int exp=0; //give experience to heroes
			for (Hero m: monsters) {
				exp+=m.getExperienceValue();
			}
			exp=(int) (exp/heroes.size());
			for (Hero h: heroes) {
				h.setExperience(h.getExperience()+exp);
			}
			//handle monster loot here
			
		}else {
			heroesTurn();
		}
	}
	public boolean isFightOver() {
		int alive=0;
		for (Hero m: monsters) {
			if(!m.isDead()){
				alive+=1;
			}
		}
		if(alive>0) {
			return false;
		}else {
			return true;
		}		
	}
	public void createMeele() {//give heroes a foe not good like this! Rework!!!
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
	//getters and setters
	public LinkedList<Hero> getMonsters() {
		return monsters;
	}
	public void setMonsters(LinkedList<Hero> monsters) {
		this.monsters = monsters;
	}
	public LinkedList<Hero> getHeroes() {
		return heroes;
	}
	public void setHeroes(LinkedList<Hero> heroes) {
		this.heroes = heroes;
	}
	
}

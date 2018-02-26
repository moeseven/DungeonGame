package gameEncounter;

import java.util.Collections;
import java.util.LinkedList;

public abstract class Hero {

	private Backpack backpack;
	private Inventory inventory;
	protected Deck deck;
	//Fight
	private Fight fight;
	private Hero target;
	//stats
	protected int hp;
	private int mana;
	private int block;
	private LinkedList<Card> drawPile;
	private LinkedList<Card> hand;
	//skills
	protected int turnDraw;
	protected int turnMana;
	public int turnBlock;
	private int blockBonus;
	private int damageBonus;
	protected int maxHp;
	public Hero(){
		backpack= new Backpack();
		inventory= new Inventory();
		
	}
	//functions
	public void setUpDrawPile() {
		//should be shuffled here
		this.setDrawPile(new LinkedList<Card>());
		for(Card c: this.getDeck().getCards()) {
	    	this.getDrawPile().add(c);
	    }
		Collections.shuffle(this.getDrawPile());
	}
	public void turnBegin(){
		this.block=turnBlock;
		this.mana=turnMana;
		int count=this.hand.size();
		for(int i=0; i<count;i++) {
			drawPile.add(hand.removeFirst());//put hand on the bottem of draw pile
		}
		for(int i=0; i<turnDraw;i++) {
			this.hand.add(drawPile.removeFirst());
		}
		
	}
	public void block(int block) {
		this.block+=block;
	}
	public void dealDamage(Hero hero,int damage) {
		hero.takeDamage(hero,damage);
	}
	public void takeDamage(Hero hero,int damage) {
		this.setBlock(block-damage);
		this.setHp(hp+block);
		if(block<0) {
			block=0;
		}
		if(hp<0) {
			hp=0;
			this.die();
		}
	}
	public void die() {
		//handle death //toughness rolls/receiving wounds?
	}
	//getters and setters
	
	public Backpack getBackpack() {
		return backpack;
	}
	public Hero getTarget() {
		return target;
	}
	public void setTarget(Hero target) {
		this.target = target;
	}
	public void setBackpack(Backpack backpack) {
		this.backpack = backpack;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public Deck getDeck() {
		return deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public int getTurnDraw() {
		return turnDraw;
	}
	public void setTurnDraw(int turnDraw) {
		this.turnDraw = turnDraw;
	}
	public int getTurnMana() {
		return turnMana;
	}
	public void setTurnMana(int turnMana) {
		this.turnMana = turnMana;
	}
	public int getTurnBlock() {
		return turnBlock;
	}
	public void setTurnBlock(int turnBlock) {
		this.turnBlock = turnBlock;
	}
	public int getBlockBonus() {
		return blockBonus;
	}
	public void setBlockBonus(int blockBonus) {
		this.blockBonus = blockBonus;
	}
	public int getDamageBonus() {
		return damageBonus;
	}
	public void setDamageBonus(int damageBonus) {
		this.damageBonus = damageBonus;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public Fight getFight() {
		return fight;
	}
	public void setFight(Fight fight) {
		this.fight = fight;
	}
	public LinkedList<Card> getDrawPile() {
		return drawPile;
	}
	public void setDrawPile(LinkedList<Card> drawPile) {
		this.drawPile = drawPile;
	}
	public LinkedList<Card> getHand() {
		return hand;
	}
	public void setHand(LinkedList<Card> hand) {
		this.hand = hand;
	}
	
}

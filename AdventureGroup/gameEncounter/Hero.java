package gameEncounter;	



public class Hero {
	private Backpack backpack;
	private Inventory inventory;
	private Deck deck;
	private Fight fight;
	//stats
	private int hp;
	private int mana;
	private int block;
	//skills
	private int turnDraw;
	private int turnMana;
	private int turnBlock;
	private int blockBonus;
	private int damageBonus;
	private int maxHp;
	public Hero(){
		
	}
	public Backpack getBackpack() {
		return backpack;
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
	
	
}

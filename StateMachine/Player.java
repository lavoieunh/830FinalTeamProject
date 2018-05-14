package BaseGame;

import UI.MyGame;

public class Player {
	private MyGame g;

	public Player(MyGame g)
	{
		this.g = g;
	}
	
	int hp;
	int currentHp;
	int timer;
	int ac;
	int attackBonus;
	int damage;
	
	public int getAC() {
		return ac;
	}
	
	public void setAttackBonus(int atk) {
		attackBonus = atk;
	}
	
	public void setDamage(int dmg) {
		damage = dmg;
	}
	
	public void setTimer(int time) {
		timer = time;
	}
	
	public void countDown(int value) {
		timer = timer - value;
		System.out.println("You have " + getTime() + " parsecs remaining! Serve the empire!");
	}
	
	public int getTime() {
		return timer;
	}
	
	public void checkTime() {
		if (timer <= 0) {
			winGame();
		}
	}
	
	public void setHP(int HP) {
		hp = HP;
	}
	public void setCurrentHP(int HP) {
		currentHp = HP;
	}
	
	public void setAC(int AC) {
		ac = AC;
	}
	
	public void setTotalHP(int HP) {
		currentHp = HP;
	}
	
	public void changeHealth(int inc) {
		hp = hp + inc;
	}
	
	public int getHealth() {
		return hp;
	}
	
	public int getTotalHealth() {
		return currentHp;
	}
	
	public void initialize() {
		setHP(20);
		setTimer(1000);
		setAC(16);
		setAttackBonus(5);
		setDamage(5);
		setCurrentHP(20);
	}
	
	public void winGame() {
		System.out.println("WIN: You feel a wave of relief wash over you as you hear the shuttlecraft arrive to your rescue!");
		System.out.println("As you ride off into the future you can only hope the next trilogy is better!");
		System.exit(0);
	}
	
	public void loseGame() {
		System.out.println("LOSE: You have died and will not be able to escape to serve the empire!");
		System.out.println("You have become one with the force!");
		System.exit(0);
	}
}

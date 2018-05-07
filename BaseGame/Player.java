package BaseGame;

import UI.MyGame;

public class Player {
	private MyGame g;

	public Player(MyGame g)
	{
		this.g = g;
	}
	
	int hp;
	int timer;
	
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
			//Code executes to win the game
		}
	}
	
	public void setHP(int HP) {
		hp = HP;
	}
	
	public void changeHealth(int inc) {
		hp = hp + inc;
	}
	
	public int getHealth() {
		return hp;
	}
	
	public void initialize() {
		setHP(20);
		setTimer(1000);
	}
	
	public void winGame() {
		
	}
	
	public void loseGame() {
		
	}
}

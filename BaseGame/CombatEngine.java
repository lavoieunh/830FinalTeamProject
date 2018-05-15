package BaseGame;

import java.util.Scanner;

public class CombatEngine {

	Scanner scanner = new Scanner( System.in );
	public boolean CombatStatus = true;
	dice set = new dice();
	
	public void PlayerTurn(String command, enemies e, Player p) {
		
		if (command.toUpperCase().equals("RUN")) {
			CombatStatus = false;
			p.countDown(1);
			System.out.println("You run from the " + e.name + " and get back to town. An hour has passed!");
		}
		if (command.toUpperCase().equals("ATTACK")) {
			attackEnemy(p, e);
		}
		if (command.toUpperCase().equals("STATS")) {
			System.out.println("Your current HP is: " + p.currentHp + " / " + "p.hp");
		}
		if(e.hp>0) {
			if(CombatStatus) {
			EnemyTurn(p, e);
			}
		}
	}
	
	public void EnemyTurn(Player p, enemies e) {
		System.out.println("It is the enemy's turn:");
		attackPlayer(p, e);
	}
	
	public void attackPlayer(Player p, enemies e) {
		int attack = set.roll(10, 1) + e.attackBonus;
		if (attack > p.ac ) {
			System.out.println("You have been hit by the " + e.name + " for " + e.damage + "damge!");
			damagePlayer(p, e);
			if (p.getTotalHealth() <= 0) {
				p.loseGame();
			}
		}
		else {
			System.out.println(e.name + " missed you!");
		}
		
	}
	
	public void attackEnemy(Player p, enemies e) {
		int attack = set.roll(10, 1) + p.attackBonus;
		if (attack > e.ac) {
			int dmg = damageEnemy(p, e);
			e.hp = e.hp - dmg;
			System.out.println("You hit the " + e.name + " for " + dmg + " damge.");
			if (e.hp <= 0) {
				System.out.println("You have defeated the " + e.name);
				p.killCount = p.killCount + 1;
				System.out.println("Your kill count is: " + p.killCount);
				CombatStatus = false;
			}
		}
		else {
			System.out.println("You missed the enemy. Thats okay, you are a storm trooper after all!");
		}
	}
	
	public int damageEnemy(Player p, enemies e) {
		int dmg = set.roll(4, 1) + p.damage;
		return dmg;
	}
	
	public void damagePlayer(Player p, enemies e) {
		p.currentHp = p.currentHp - e.damage;
	}
	
}

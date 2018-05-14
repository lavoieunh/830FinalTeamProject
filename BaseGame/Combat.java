package BaseGame;

import java.util.Scanner;

import UI.MyGame;


public class Combat {

	dice diceSet = new dice();
	Scanner scanner = new Scanner( System.in );
	
	public void battle(Player p, enemies e) {
		
		boolean gameOn = true;
		
		CombatEngine c = new CombatEngine();
		
		System.out.println("You are attacked by a " + e.name);
		
		while(gameOn) {
			
			System.out.println("Your Turn> attack, run, stats");
			
			String command = scanner.nextLine();
			
			c.PlayerTurn(command, e, p);
			
			gameOn = c.CombatStatus;
		}
	}
	
}

package mygame;

public class CombatState implements GameState {
	
	GameStateMachine gameState;
	
	//Your combat code here
	
	public CombatState(GameStateMachine gameState) {
		this.gameState = gameState;
	}
	
	public void exploreState() {
		//Use this method to return to explore after combat is over
		gameState.setState(gameState.getExploreState());
		

	}

	
	public void inventoryState() {
		// Cannot access inventory during combat

	}

	
	public void winState() {
		// Cannot win the game during combat

	}

	
	public void loseState() {
		//Use this method if the player drops below 0 hp during combat
		gameState.setState(gameState.getLoseState());

	}

	
	public void combatState() {
		// Already in combat

	}

	
	public void restState() {
		// No rest for the combat

	}
	
	public void welcomeState() {
		// Cannot get to welcome from combat
		
	}

}

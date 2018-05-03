package mygame;

public class WelcomeState implements GameState {
	GameStateMachine gameState;
	
	public WelcomeState(GameStateMachine gameState) {
		this.gameState = gameState;
	}
	
	//Your welcome code here
	
	public void exploreState() {
		
		//use this method to move from welcome to the start of the game - explore
		gameState.setState(gameState.getExploreState());

	}

	public void inventoryState() {
		// Can't get to this state from welcome

	}

	
	public void winState() {
		// Can't get to this state from welcome

	}

	
	public void loseState() {
		// Can't get to this state from welcome

	}

	
	public void combatState() {
		// Can't get to this state from welcome

	}

	
	public void restState() {
		// Can't get to this state from welcome

	}
	
	public void welcomeState() {
		// Can't get to this state from welcome
		
	}

}

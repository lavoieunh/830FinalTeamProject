package StateMachine;

public class WinState implements GameState {
	GameStateMachine gameState;
	
	public WinState(GameStateMachine gameState) {
		this.gameState = gameState;
	}
	
	//Your win state code here
	
	public void exploreState() {
		// Cant get to this state from win

	}

	
	public void inventoryState() {
		// Cant get to this state from win

	}

	
	public void winState() {
		// Cant get to this state from win

	}


	public void loseState() {
		// Cant get to this state from win

	}

	public void combatState() {
		// Cant get to this state from win

	}

	
	public void restState() {
		// Cant get to this state from win

	}
	
	public void welcomeState() {
		//Use this method to restart the game
		gameState.setState(gameState.getWelcomeState());
		
	}

}

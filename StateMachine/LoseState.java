package StateMachine;

public class LoseState implements GameState {
	GameStateMachine gameState;
	
	public LoseState(GameStateMachine gameState) {
		this.gameState = gameState;
	}
	
	//Your lose game code here
	
	
	public void exploreState() {
		//Cannot get to explore if you lose

	}

	public void inventoryState() {
		//Cannot get to inventory if you lose

	}

	public void winState() {
		// Cannot win if you lose

	}

	public void loseState() {
		// Cannot lose if you have lose

	}

	public void combatState() {
		//No more combat if you lose

	}

	public void restState() {
		//Cant rest if you lose

	}
	@Override
	public void welcomeState() {
		//Use if player wants to start game again
		gameState.setState(gameState.getWelcomeState());
		
	}

}

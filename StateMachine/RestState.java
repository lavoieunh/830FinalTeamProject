package StateMachine;

public class RestState implements GameState {

	GameStateMachine gameState;
	
	public RestState(GameStateMachine gameState) {
		this.gameState = gameState;
	}
	
	//Your rest game code ere
	
	public void exploreState() {
		//Use this to return to explore after rest is completed
		gameState.setState(gameState.getExploreState());

	}

	public void inventoryState() {
		//Cant inventory while resting

	}

	public void winState() {
		//Cant win while resting

	}

	public void loseState() {
		//Cant lose while resting

	}

	public void combatState() {
		//Cant fight while resting

	}

	public void restState() {
		//Cant rest while resting

	}

	public void welcomeState() {
		// Cant get to welcome while resting
		
	}

}

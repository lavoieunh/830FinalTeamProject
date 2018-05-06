package StateMachine;

public class InventoryState implements GameState {
	
	GameStateMachine gameState;

	public InventoryState(GameStateMachine gameState) {
		this.gameState = gameState;
	}
	
	//Inventory code here
	
	public void exploreState() {
		
		//the set and get state methods are defined in GameStateMachine.java
		//evoke this method if the user wants to return to explore
		gameState.setState(gameState.getExploreState());

	}

	
	public void inventoryState() {
		// Already in inventory state

	}

	
	public void winState() {
		// Cant get directly to win state

	}

	
	public void loseState() {
		// Cant get directly to lose state

	}

	
	public void combatState() {
		//Cant go from inventory to combat
	}

	
	public void restState() {
		//Cant go from inventory to rest

	}
	
	public void welcomeState() {
		// Cant get directly to welcome state
		
	}

}

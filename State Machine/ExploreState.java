package mygame;

public class ExploreState implements GameState{

	GameStateMachine gameState;
	
	public ExploreState(GameStateMachine gameState) {
		
		this.gameState = gameState;
	}
	

	//Your explore code here
	 
	
	public void exploreState() {
		
		//You should not go from Explore to Explore
		
	}
	
	public void inventoryState() {
		
		//the set and get state methods are defined in GameStateMachine.java
		//evoke this method if the player selects command to go through inventory
		gameState.setState(gameState.getInventoryState());
		
	}
	
	public void winState() {
		
		//You can't just win from Explorer
		
	}
	
	public void loseState() {
		//You can't lose from Explorer
		
	}

	
	public void combatState() {
		
		//the set and get state methods are defined in GameStateMachine.java
		//evoke this method if combat would be initiated
		gameState.setState(gameState.getCombatState());
		
	}

	
	public void restState() {
		
		//the set and get state methods are defined in GameStateMachine.java
		//evoke this method if the user selects they would like to rest
		gameState.setState(gameState.getRestState());
		
	}

	
	public void welcomeState() {
		// Cant get directly from explore to welcome
		
	}
		
}

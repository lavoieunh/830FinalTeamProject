package StateMachine;

public class GameStateMachine {
	GameState exploreState;
	GameState inventoryState;
	GameState restState;
	GameState combatState;
	GameState welcomeState;
	GameState winState;
	GameState loseState;
	
	GameState gs;
	
	public GameStateMachine() {
		exploreState = new ExploreState(this);
		inventoryState = new InventoryState(this);
		restState = new RestState(this);
		combatState = new CombatState(this);
		welcomeState = new WelcomeState(this);
		winState = new WinState(this);
		loseState = new LoseState(this);
		this.gs = welcomeState;
	}
	void goToExplore() {
		gs.exploreState();
	}
	void goToInventory() {
		gs.inventoryState();
	}
	void goToRest() {
		gs.restState();
	}
	void goToCombat() {
		gs.combatState();
	}
	void goToWelcome() {
		gs.welcomeState();
	}
	void goToWin() {
		gs.winState();
	}
	void goToLose() {
		gs.loseState();
	}
	void setState(GameState gameState) {
		this.gs = gameState;
	}
	public GameState getExploreState() {
		return exploreState;
	}
	public GameState getInventoryState() {
		return inventoryState;
	}
	public GameState getRestState() {
		return restState;
	}
	public GameState getCombatState() {
		return combatState;
	}
	public GameState getWelcomeState() {
		return welcomeState;
	}
	public GameState getWinState() {
		return winState;
	}
	public GameState getLoseState() {
		return loseState;
	}
	
}

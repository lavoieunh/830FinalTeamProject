package StateMachine;

//The interface implemented by each state

public interface GameState {
	void exploreState();
	void inventoryState();
	void winState();
	void loseState();
	void combatState();
	void restState();
	void welcomeState();
}

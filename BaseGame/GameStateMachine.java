package BaseGame;

public class GameStateMachine {
	int state;
	public final int EXPLORE = 0;
	public final int INVENTORY = 1;
	public final int REST = 2;
	public final int COMBAT = 3;
	public final int WELCOME = 4;
	public final int WIN = 5;
	public final int LOSE = 6;
	
	public void checkState() {
		switch (state) {
		case EXPLORE:
			if (Player.getInstance().getHealth() <= 0) state = LOSE;
			//if (Player.getInstance().getHealth() > 0 + "timer = 0") state = WIN;
			break;
		case INVENTORY:

			break;
		case REST:
			//If player health <= 0
			if (Player.getInstance().getHealth() <= 0) state = LOSE;
			//if (Player.getInstance().getHealth() > 0 + "timer = 0") state = WIN;
			break;
		case COMBAT:
			if (Player.getInstance().getHealth() <= 0) state = LOSE;
			//if (Player.getInstance().getHealth() > 0 + "timer = 0") state = WIN;
			break;
		case WELCOME:

			break;
		case WIN:
			//inform player game is won
			System.out.println("You have won the game!");
			//ask player if want to quit or start again
			System.out.println("Do you wish to play again?");
			//GET TEXT BOX FOR USER INPUT HERE - FROM EXPLORE STATE POSSIBLY?
			//If "yes", then...
			state = WELCOME;
			//If "no", exit the game.
			System.exit(0);
			break;
		case LOSE:
			//inform player game is lost
			System.out.println("You have lost the game!");
			//ask player if want to quit or start again
			System.out.println("Do you wish to play again?");
			//GET TEXT BOX FOR USER INPUT HERE - FROM EXPLORE STATE POSSIBLY?
			//If "yes", then...
			state = WELCOME;
			//If "no", exit the game.
			System.exit(0);
			break;
		}
	}
}

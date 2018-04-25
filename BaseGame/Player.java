package BaseGame;

public class Player { 
	//Singleton to create single instance of a Player
	private static Player Instance = null;
	private Player( ) {
		//constructor for the Player. Also sets Health to 10.
		Health = 10;
	}
	public static Player getInstance( ) {
		if(Instance == null) {
			Instance = new Player();
		}
		return Instance;
	}
	//increasing player health through MedPack usage
	private int Health;
		//method to change the health
	public int changeHealth(int change) {
		Health += change;
		
		return Health;
	}
	public int getHealth() {
		return Health;
	}
}

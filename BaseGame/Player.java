package BaseGame; 

public class Player { 
	
	private int Health;
	
	private Player( ) {
		//constructor for the Player. Also sets Health to 10.
		Health = 10;
	}
	
	//Singleton to create single instance of a Player
	private static Player Instance = null;
	
	public static Player getInstance() {
		if(Instance == null) {
			Instance = new Player();
		}
		return Instance;
	}

	private String pUser_Name = "";  
	private Integer pDefense_Value = 0; 
	private Integer pAttack_Value = 0; 
	
	public String getsUser_Name() {
		return pUser_Name;
	}

	public void setsUser_Name(String User_Name) {
		pUser_Name = User_Name;
	}

	public Integer getAttack_Value() {
		return pAttack_Value;
	}

	public void setAttack_Value(Integer Attack_Value) {
		pAttack_Value = Attack_Value;
	}

	public Integer getDefense_Value() {
		return pDefense_Value;
	}

	public void setDefense_Value(Integer defense_value) {
		pDefense_Value = defense_value;
	}
	
	public int changeHealth(int change) {
		Health += change;
		
		return Health;
	}
	public int getHealth() {
		return Health;
	}
	

}

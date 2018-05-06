package BaseGame; 

public class Player { 
	
	//GameStateMachine gameState;
	
	
	public Player (String User_Name, Integer Defense_Value, Integer Attack_Value) { 
		setsUser_Name(User_Name);
		setDefense_Value(Defense_Value);
		setAttack_Value(Attack_Value);
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
	

}

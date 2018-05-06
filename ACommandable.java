package UI;

public abstract class ACommandable implements Commandable{
	
	private String sCommand = "";
	
	
	
	public boolean matchCommand(String s) 
	{
		return s.toUpperCase().equals(sCommand);
	}
	
	public void doCommand(Object o) {
		
		
	}
}

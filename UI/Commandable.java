package UI;

public interface Commandable {
	
	public void doCommand(MyGame g);
	
	public boolean matchCommand(String s);
	
	public String getCommandText();
		
}

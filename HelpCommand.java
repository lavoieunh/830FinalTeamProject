package UI;

import java.util.ArrayList;

public class HelpCommand implements Commandable{

	private String sHelpCommands = "";
	private ArrayList<String> sCommands = new ArrayList<String>();
	
	public HelpCommand(MyGame g)
	{
		g.Subscribe(this);
	}

	@Override
	public void doCommand(MyGame g) {
		
		UserInterface.UserOutput(getCommands()); 
	}

	@Override
	public boolean matchCommand(String s) {

		
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
	}

	@Override
	public String getCommandText() {
		
		return "Help";
	}
	
	public void Subscribe(String c)
	{
		sCommands.add(c);
	}
	
	public void Unsubscribe(String c)
	{
		sCommands.remove(sCommands.indexOf(c));
	}
	
	public String getCommands()
	{
		sHelpCommands = "Enter commands: ";
		
		for(String s:sCommands)
		{
			sHelpCommands += "| " + s + " ";
		}
		
		return sHelpCommands;
	}
	
}

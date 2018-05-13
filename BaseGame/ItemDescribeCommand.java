package BaseGame;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class ItemDescribeCommand implements Commandable {

	public ItemDescribeCommand(MyGame g) {
		g.Subscribe(this);
	}

	@Override
	public void doCommand(MyGame g) {
		Integer iStart = -1;
		Integer iLenght = 0;
		Integer i = -1;
		
		iStart = g.getUserInput().toUpperCase().indexOf(getCommandText().toUpperCase());
		iLenght = g.getUserInput().length();
		
		
		
		try
		{
			i = Integer.parseInt(g.getUserInput().substring(iStart + getCommandText().length(), iLenght));	
		}
		catch(Exception e){} //swallow the error.
		finally {}
		
		if(i >= 0 && i != null)
		{
			UserInterface.UserOutput("Name: " + g.BeltAndBackPack.getItem(i).getName() + "\r\n" 
										+"Description: " + g.BeltAndBackPack.getItem(i).getDescription() 
						, true);
		}
		else
		{
			UserInterface.UserOutput("Error: Item index not found! " + "Invaild entry!  Use: 'Describe#'",true);
			UserInterface.UserOutput(g.HelpMe.getCommands(),true);
		}
		
	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().contains(getCommandText().toUpperCase()); //returns true for match and false for no match.
		
	}

	@Override
	public String getCommandText() {
		
		return "Describe";
	}

}

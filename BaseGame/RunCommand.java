package BaseGame;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class RunCommand implements Commandable {

	public RunCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	@Override
	public void doCommand(MyGame g) {
		UserInterface.UserOutput("You attempt to run away...");
		//Random True False  Create a class in the that returns the true/false or a roll value
		String sResult = "";
		if(true)
		{
			sResult = "..you have successfully run away.  Coward!";
			
		}
		else
		{
			sResult = "..you have failed to run away.";
			
		}
		UserInterface.UserOutput(sResult);
		
		g.Unsubscribe(g.BeerMe);
		
	}

	@Override
	public boolean matchCommand(String s) {
		
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
	}

	@Override
	public String getCommandText() {
		
		return "Run";
	}

}

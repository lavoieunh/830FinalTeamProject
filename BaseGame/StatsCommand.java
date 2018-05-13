package BaseGame;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class StatsCommand implements Commandable {

	public StatsCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	@Override
	public void doCommand(MyGame g) {
		UserInterface.UserOutput("HP: " + g.player.getHealth(), true);
		UserInterface.UserOutput("Time Remaining to Evacuatoin: " + g.player.getTime() + " parsecs", true);
		g.HelpMe.doCommand(g);
	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
		
	}

	@Override
	public String getCommandText() {
		// TODO Auto-generated method stub
		return "stats";
	}

}

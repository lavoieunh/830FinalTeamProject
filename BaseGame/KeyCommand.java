package BaseGame;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class KeyCommand implements Commandable {

	public KeyCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	
	@Override
	public void doCommand(MyGame g) {
		UserInterface.UserOutput(
				"Key: " + "\r\n" +" @ - Player" + "\r\n"
				+"T - Tree" + "\r\n"
				+"X - Debris" + "\r\n"
				//+"r - Rebel" + "\r\n"
				//+"e - Ewok" + "\r\n"
				+"o - NPC \r\n"
				);
		//g.HelpMe.doCommand(g);

	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
	}

	@Override
	public String getCommandText() {
		// TODO Auto-generated method stub
		return "KEY";
	}

}

package BaseGame;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class KeyCommand implements Commandable {

	public KeyCommand(MyGame g)
	{
		
		g.Subscribe(this);
	}
	
	Boolean bOn = true;
	
	@Override
	public void doCommand(MyGame g) {
		String sPlayerInfo = "(Starts in top left corner)";
		String sKeyText = "";
				
				if(bOn)
				{
					sKeyText = "Key: " + "\r\n" +"@ - Player " + sPlayerInfo + "\r\n";
				} 
				else 
				{
					sKeyText = "Key: " + "\r\n" +"@ - Player " + "\r\n";
				}
				sKeyText = sKeyText + "T - Tree" + "\r\n"
				+"X - Debris" + "\r\n"
				//+"r - Rebel" + "\r\n"
				//+"e - Ewok" + "\r\n"
				+"o - NPC \r\n";
				
		
		UserInterface.UserOutput(sKeyText);
		//g.HelpMe.doCommand(g);
		bOn = false;

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

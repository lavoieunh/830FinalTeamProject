package BaseGame;

import UI.Commandable;
import UI.MyGame;

public class UseMedPackCommand implements Commandable {

	public UseMedPackCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	@Override
	public void doCommand(MyGame g) {
		MedPack m = new MedPack("Med Pack", "Fixes me", 1, 1,true);
		
		m.UseItem(g.player);
		
		
	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
	}

	@Override
	public String getCommandText() {
		
		return "MED";
	}

}

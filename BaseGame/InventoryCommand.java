package BaseGame;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class InventoryCommand implements Commandable {

	public InventoryCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	@Override
	public void doCommand(MyGame g) {
		
		UserInterface.UserOutput(g.BeltAndBackPack.List());
	

	}

	@Override
	public boolean matchCommand(String s) {
		
		return s.toUpperCase().equals("INVENTORY"); //returns true for match and false for no match.
	}
	
}

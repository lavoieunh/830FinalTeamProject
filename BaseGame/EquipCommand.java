package BaseGame;

import UI.Commandable;
import UI.MyGame;

public class EquipCommand implements Commandable {

	@Override
	public void doCommand(MyGame g) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
	}

	@Override
	public String getCommandText() {
		
		return "Equip";
	}

}

package UI;

public class MapCommand implements Commandable {

	public MapCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	@Override
	public void doCommand(MyGame g) {
		
		UserInterface.UserOutput(g.GameMap.getMap(), false);
	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
	}

	@Override
	public String getCommandText() {
		
		return "Map";
	}

}

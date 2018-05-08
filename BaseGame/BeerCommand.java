package BaseGame;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class BeerCommand implements Commandable {

	public BeerCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	@Override
	public void doCommand(MyGame g) {
		String s = "";
		
		s = "                              .sssssssss.\r\n" + 
				"                        .sssssssssssssssssss\r\n" + 
				"                      sssssssssssssssssssssssss\r\n" + 
				"                     ssssssssssssssssssssssssssss\r\n" + 
				"                      @@sssssssssssssssssssssss@ss\r\n" + 
				"                      |s@@@@sssssssssssssss@@@@s|s\r\n" + 
				"               _______|sssss@@@@@sssss@@@@@sssss|s\r\n" + 
				"             /         sssssssss@sssss@sssssssss|s\r\n" + 
				"            /  .------+.ssssssss@sssss@ssssssss.|\r\n" + 
				"           /  /       |...sssssss@sss@sssssss...|\r\n" + 
				"          |  |        |.......sss@sss@ssss......|\r\n" + 
				"          |  |        |..........s@ss@sss.......|\r\n" + 
				"          |  |        |...........@ss@..........|\r\n" + 
				"           \\  \\       |............ss@..........|\r\n" + 
				"            \\  '------+...........ss@...........|\r\n" + 
				"             \\________ .........................|\r\n" + 
				"                      |.........................|\r\n" + 
				"                     /...........................\\\r\n" + 
				"                    |.............................|\r\n" + 
				"                       |.......................|\r\n" + 
				"                           |...............|\r\n " +
				"							you are now beered!\r\n";
		
		UserInterface.UserOutput(s);

	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
	}

	@Override
	public String getCommandText() {
		
		return "Beer";
		
	}

}

package UI;

public class QuitCommand 
implements Commandable
{

	public QuitCommand(MyGame g) 
	{
		g.Subscribe(this);
	}
	
	@Override
	public void doCommand(MyGame g) {
		g.QuitProgram();
		UserInterface.UserOutput("Good Bye!");
	}
	
	@Override
	public boolean matchCommand(String s) {
		
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.
		
	}

	@Override
	public String getCommandText() {
		
		return "Quit";
	}

}

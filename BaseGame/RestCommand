package BaseGame;
import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class RestCommand implements Commandable { 
	
	public RestCommand(MyGame g) {
		g.Subscribe(this);
	} 
	
	int resting = 0;


	@Override
	public void doCommand(MyGame g) {
		
				if (g.player.getHealth() < 100);
				{
					System.out.println("All healthy");

					//HP = timer + 1 hp;

					g.Subscribe(this);
				} 
				if (g.player.getHealth() > 100);  
				{
					int hp = g.player.getHealth();
					hp = hp + 5;
					resting = hp;
					g.player.changeHealth(resting); 
					
				}
						
		
		
	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.

	}

	@Override
	public String getCommandText() {
		return "Getting Healthy, rest up";
	}
}

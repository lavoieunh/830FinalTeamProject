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
		
				if (g.player.getTotalHealth() > g.player.getHealth());
				{
					System.out.println("All healthy");
					
				} 
				if (g.player.getHealth() < g.player.getTotalHealth());  
				{
					int hp = g.player.getHealth();
					hp = hp + 5;
					System.out.println("You have rested for 5 parsecs and recovered 5 HP. Your total is: " + g.player.getHealth());
					resting = hp;
					g.player.changeHealth(resting); 
					g.player.countDown(5);
				}
						
		
		
	}

	@Override
	public boolean matchCommand(String s) {
		return s.toUpperCase().equals(getCommandText().toUpperCase()); //returns true for match and false for no match.

	}

	@Override
	public String getCommandText() {
		return "REST";
	}
}

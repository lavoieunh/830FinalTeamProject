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
		
				
				if (g.player.currentHp >= g.player.hp)
				{
					System.out.println("All healthy");
					
				} 
				if (g.player.currentHp < g.player.hp)  
				{
					g.player.currentHp = g.player.currentHp + 5;
					if (g.player.currentHp > g.player.hp) {
						g.player.currentHp = g.player.hp;
					}
					System.out.println("You have rested for 5 parsecs and recovered 5 HP. Your total is: " + g.player.currentHp + " / " + g.player.hp);
					g.player.countDown(5);
					g.player.checkTime();
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

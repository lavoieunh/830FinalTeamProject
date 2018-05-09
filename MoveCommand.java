package BaseGame;

import java.util.ArrayList;

import com.sun.javafx.geom.Point2D;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

public class MoveCommand implements Commandable {

	public MoveCommand(MyGame g)
	{
		g.Subscribe(this);
	}
	
	@Override
	public void doCommand(MyGame g) {
		
		//to do...
		UserInterface.UserOutput(g.getUserInput().toUpperCase());
		
		Point2D p = g.GameMap.getLocation();
		Integer x = (int)(p.x);
		Integer y = (int)p.y;
		
		g.GameMap.setLocation(".", x, y);
		
		
		switch (g.getUserInput().toUpperCase())
		{
			case "N":
				if(x > 0 && g.GameMap.Clipable(x-1,y))
				{
					x--;
				}
				break;
			case "S":
				if(x < g.GameMap.getMapHeight()-1 && g.GameMap.Clipable(x+1,y))
				{
					x++;
				}
				break;
			case "E":
				UserInterface.UserOutput(g.GameMap.Clipable(x, y+1).toString());
				if(y < g.GameMap.getMapWidth()-1 && g.GameMap.Clipable(x,y+1))
				{
					y++;
				}
				break;
			case "W":
				if(y > 0 && g.GameMap.Clipable(x,y-1))
				{
					y--;
				}
				break;	
			default:
				break;
				
		}
		g.GameMap.setLocation("@", x, y);
		g.MapMe.doCommand(g);

	}

	@Override
	public boolean matchCommand(String s) {
		
		String cmd = "NSEW";
		
		return cmd.contains(s.toUpperCase());
		
	}

	@Override
	public String getCommandText() {
		
		return "Move type: N,S,E,W";
	}

}

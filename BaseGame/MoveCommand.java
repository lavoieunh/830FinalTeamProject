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
		
		//UserInterface.UserOutput(g.getUserInput().toUpperCase());  //Debug
		
		Point2D p = g.GameMap.getLocation();
		Integer x = (int)(p.x);
		Integer y = (int)p.y;
		
		
		
		//g.GameMap.setLocation(".", x, y);
		
		/*
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
				//UserInterface.UserOutput(g.GameMap.Clipable(x, y+1).toString()); //Debug
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
		*/
		p = g.GameMap.moveObject(p, g.getUserInput().toUpperCase()); //Get the new point.
		g.GameMap.setLocation("@", (int)p.x, (int)p.y);
		g.MapMe.doCommand(g);
		g.player.countDown(1);
		
		//UserInterface.UserOutput(String.valueOf(g.GameMap.getPVP(g.GameMap.getLocation(), "o").distance(-1,  -1))); //debug
		//UserInterface.UserOutput((g.GameMap.getPVP(g.GameMap.getLocation(), "o").toString()));	
		
		Point2D pt = g.GameMap.getPVE(g.GameMap.getLocation(), "o");
		
		//UserInterface.UserOutput(pt.x + " " +pt.y);//debug
		//UserInterface.UserOutput(String.valueOf(pt.distance(-1, -1))); //debug
		
		if(pt.distance(-1,-1)==0)
		{
			//UserInterface.UserOutput("No PVE"); //debug
			
		}
		else
		{
			//UserInterface.UserOutput("PVE"); //debug
			g.FightMeBro.battle(g.player, g.BaddyMe.randMonster());
			g.GameMap.setLocation(".", (int)pt.x, (int)pt.y); // needs to have a true / false return update to this if pve success.
		}
			

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

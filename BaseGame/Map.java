package BaseGame;

import java.util.Random;

import com.sun.javafx.geom.Point2D;

import UI.UserInterface;

public class Map {
	
	private Integer iGameMapDimention = 32;
	private Integer iGameMapWidth = iGameMapDimention;
	private Integer iGameMapHeight = iGameMapDimention;
	
	
	public Map(int x, int y)
	{
		GameMap = new String[x][y];
		ptLocation.setLocation(0, 0); //Starting point on the map
		for(int i = 0; i < GameMap.length; i++)
		{
			for(int j = 0; j < GameMap.length; j++)
			{
				GameMap[i][j] = MapObject();
			}
		}
		
		GameMap[(int) ptLocation.x][(int) ptLocation.y] = "@";
		
	}

	String[][] GameMap;
	Point2D ptLocation = new Point2D();
	
	public String getMap()
	{
		String sMap = "";
		for(int i = 0; i < GameMap.length; i++)
		{
			for(int j = 0; j < GameMap.length; j++)
			{
				sMap += GameMap[i][j].toString() + " ";
			}
			sMap += "\r\n"; //add a new line to the string.
		}
				
		return sMap;
	}
	//bob
	public Point2D getLocation()
	{
		return ptLocation;
	}
	
	public Integer getMapWidth()
	{
		return iGameMapWidth;
	}
	
	public Integer getMapHeight()
	{
		return iGameMapHeight;
	}
	
	public void setLocation(String sIcon, Integer x, Integer y)
	{
		GameMap[x][y] = sIcon;
		ptLocation.setLocation(x, y);
	}
	
	private int roll(int max, int min) {
		Random r = new Random();
		int rand = r.nextInt(max - min + 1) + min;
		return rand;
	}

	private String MapObject()
	{
		String[] MapObs = 
		{
				"X" //Debris
				,"T" //Tree
				,"o" //Ewock or //rebel
				//,"r" 
				,".",".",".",".",".",".",".",".",".",".",".",".","." // empty space
				
		};
		
		return MapObs[roll(MapObs.length-1, 0)];
	}
	
	public Boolean Clipable(Integer x, Integer y)
	{
		//UserInterface.UserOutput(GameMap[x][y].toString()); //debug
		boolean bReturn = false;
		//Make sure the point is within the array range.
		//if(x>0 && x< iGameMapHeight-1 && y>0 && y< iGameMapWidth-1)
		//{
			bReturn = GameMap[x][y].toString().contains("."); 
		//}
		
		return bReturn;
	}
	
	private String getValueIn(Integer x, Integer y) // returns the icon value of the specified map location.
	{
		return GameMap[x][y].toString();
	}
	
	public Point2D getPVE(Point2D Point, String sMatch)
	{
		//Look at all the map locations around the given point and return the first point with a match of the given icon.
		
		Integer x = -1;
		Integer y = -1;
		String sIcon = "";
		Point2D p = new Point2D();
		p.x = x; 
		p.y = y;
	
		x =  (int)this.getLocation().x;
		y = (int)this.getLocation().y;
		
		for(int i = 0; i<=7; i++)
		{			
			switch(i)
			{
				case 0:
					if(y>0)
					{
						sIcon = getValueIn(x,y-1);//look 9 O'clock
					}
					break;
				case 1:
					if(y>0 && x>0)
					{
						sIcon = getValueIn(x-1,y-1);//look 10:30 O'clock
					}
					break;
				case 2:
					if(x>0)
					{
						sIcon = getValueIn(x-1,y);//look 12 O'clock
					}
					break;	
				case 3:
					if(x>0 && y<getMapWidth()-2)
					{
						sIcon = getValueIn(x-1,y+1);//look 1:30 O'clock
					}
					break;
				case 4:
					if(y<getMapWidth()-2)
					sIcon = getValueIn(x,y+1);//look 3 O'clock
					break;
				case 5:
					if(x<getMapHeight()-2 && y<getMapWidth()-2)
					{
						sIcon = getValueIn(x+1,y+1);//look 4:30 O'clock
					}
					break;
				case 6:
					if(x<getMapHeight()-2)
					{
						sIcon = getValueIn(x+1,y);//look 6 O'clock
					}
					break;
				case 7:
					if(y>0 && x<getMapHeight()-2)
					{
						sIcon = getValueIn(x+1,y-1);//look 7:30 O'clock
					}
					break;
				default:
					return p;
					
			}
			if(sIcon.compareTo(sMatch) == 0) //finds the difference
			{
				p.setLocation((float)x, (float)y);
				break;
			}
			
		}
		return p;
	}

	
}

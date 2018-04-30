package BaseGame;

import com.sun.javafx.geom.Point2D;

public class Map {
	
	public Map(int x, int y)
	{
		GameMap = new String[x][y];
		ptLocation.setLocation(0, 0); //Starting point on the map
		for(int i = 0; i < GameMap.length; i++)
		{
			for(int j = 0; j < GameMap.length; j++)
			{
				GameMap[i][j] = ".";
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
	
	

}

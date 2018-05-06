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
				,"e" //Ewock
				,"r" //rebel
				,".",".",".",".",".",".",".",".",".",".",".",".","." // empty space
				
		};
		
		return MapObs[roll(MapObs.length-1, 0)];
	}
	
	public Boolean Clipable(Integer x, Integer y)
	{
		UserInterface.UserOutput(GameMap[x][y].toString()); //debug
		return GameMap[x][y].toString().contains(".");
	}

	
}

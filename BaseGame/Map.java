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
		
		//GameMap[(int) ptLocation.x][(int) ptLocation.y] = "@";
		setLocation("@",(int) ptLocation.x, (int) ptLocation.y);
		
	}

	String[][] GameMap;
	Point2D ptLocation = new Point2D();
	
	public String getMap()
	{
		
		if(roll(1,0) == 1) //randomly change the location of the NPC's on the map.
		{
			moveNPC();
		}
		
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
		if(sIcon.equals("@")) //player track location.
		{
		  ptLocation.setLocation(x, y);
		}
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
		Point2D pE = new Point2D(); // enemy
		
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
						pE.setLocation(x,y-1);
					}
					break;
				case 1:
					if(y>0 && x>0)
					{
						sIcon = getValueIn(x-1,y-1);//look 10:30 O'clock
						pE.setLocation(x-1,y-1);
					}
					break;
				case 2:
					if(x>0)
					{
						sIcon = getValueIn(x-1,y);//look 12 O'clock
						pE.setLocation(x-1,y);
					}
					break;	
				case 3:
					if(x>0 && y<getMapWidth()-2)
					{
						sIcon = getValueIn(x-1,y+1);//look 1:30 O'clock
						pE.setLocation(x-1,y+1);
					}
					break;
				case 4:
					if(y<getMapWidth()-2)
					{
						sIcon = getValueIn(x,y+1);//look 3 O'clock
						pE.setLocation(x,y+1);
					}
					break;
				case 5:
					if(x<getMapHeight()-2 && y<getMapWidth()-2)
					{
						sIcon = getValueIn(x+1,y+1);//look 4:30 O'clock
						pE.setLocation(x+1,y+1);
					}
					break;
				case 6:
					if(x<getMapHeight()-2)
					{
						sIcon = getValueIn(x+1,y);//look 6 O'clock
						pE.setLocation(x+1,y);
					}
					break;
				case 7:
					if(y>0 && x<getMapHeight()-2)
					{
						sIcon = getValueIn(x+1,y-1);//look 7:30 O'clock
						pE.setLocation(x+1,y-1);
					}
					break;
				default:
					pE.setLocation(-1,-1);
					return p;
					
			}
			if(sIcon.compareTo(sMatch) == 0) //finds the difference
			{
				//p.setLocation((float)x, (float)y);
				break;
			}
			else 
			{
				pE.setLocation(-1,-1);
			}
			
		}
		return pE;
	}

	private void moveNPC()
	{
		String s = "";
		Integer iDirection = -1;
		String[] sDirection = new String[] {"N","S","E","W"};
		Point2D p = new Point2D();
		
		
		for(int i = 0; i < GameMap.length; i++)
		{
			for(int j = 0; j < GameMap.length; j++)
			{
				//s += GameMap[i][j].toString() + " ";
				s = GameMap[i][j].toString();
				if(s.equals("o"))
				{
					iDirection =  roll(3,0);
					p.x = i;
					p.y = j;
					p = moveObject(p, sDirection[iDirection]);	
					setLocation(s, (int)p.x, (int)p.y);
							
						
				}
			}
			
		}
	}
	
	public Point2D moveObject(Point2D currentLocation, String Direction)
	{
		
		Point2D pNewLoc = new Point2D();
		
		Point2D p = currentLocation;
		Integer x = (int)(p.x);
		Integer y = (int)p.y;
		
		setLocation(".", x, y);
		
		
		switch (Direction.toUpperCase())
		{
			case "N":
				if(x > 0 && Clipable(x-1,y))
				{
					x--;
				}
				break;
			case "S":
				if(x < getMapHeight()-1 && Clipable(x+1,y))
				{
					x++;
				}
				break;
			case "E":
				
				if(y < getMapWidth()-1 && Clipable(x,y+1))
				{
					y++;
				}
				break;
			case "W":
				if(y > 0 && Clipable(x,y-1))
				{
					y--;
				}
				break;	
			default:
				break;
				
		}
		
		pNewLoc.x = x;
		pNewLoc.y = y;
		
		
		return pNewLoc;
	}
	
}

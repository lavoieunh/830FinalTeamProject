package BaseGame;

import UI.MyGame;
import UI.UserInterface;

public class Welcome {
	public Welcome(MyGame g)
	{
		
	}
	public void intro() {
		String sCR = System.getProperty("line.separator");
		UserInterface.UserOutput(sCR + "You are the AT-ST driver pulled, by Chewbacca, from the AT-ST and commandeered by Chewbacca and two Ewoks and you find yourself lying on the floor of the forest moon" + sCR 
				+ " of Endor not far from the shield generator command bunker. You are injured to a certain degree from your fall have been overlooked by the puny band of filthy rebel forces and Ewoks.  " + sCR 
				+ " You are presumed KIA and forgotten by the captured Imperial Forces. You remain uncaptured and unseen by the Ewoks and rebels when you see the shield generator command bunker fall to rebel forces," + sCR 
				+ " the shield generator destroyed and the Death Star II destroyed as well. \r\n \r\n" + 
				"In order to remain alive and uncaptured with any possibility of returning to remaining Imperial Forces, you must evade capture or death by avoiding Ewoks, rebel forces and rebel forces who are " + sCR 
				+ "arriving after the destruction of Death Star. You need to obtain provisions, a weapon(s), a map, a medical kit, communication equipment and possibly a surface transport in order to survive long enough" + sCR 
				+ " to depart this infested dirtball called a forest moon. \r\n \r\n" + 
				"How will you know where to go? What are your means of departing the forest moon? How will you communicate to remaining Imperial Forces?  If you do NOT have a means of departing the moon " + sCR
				+ "or communicating with remaining Imperial Forces you will surely perish...\r\n" + "\r\n"
				//+ "\r\n"
				//+"Key: " + "\r\n" +" @ - Player" + "\r\n"
				//+"T - Tree" + "\r\n"
				//+"X - Debris" + "\r\n"
				//+"r - Rebel" + "\r\n"
				//+"e - Ewok" + "\r\n"
				);
		
	}
}

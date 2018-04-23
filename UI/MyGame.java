package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BaseGame.Inventory;
import BaseGame.InventoryCommand;
import BaseGame.ItemDescribeCommand;

public class MyGame {

	public List<Commandable> UserCommands = new ArrayList<Commandable>();
	public HelpCommand HelpMe = new HelpCommand(this);
	public QuitCommand QuitMe = new QuitCommand(this);
	//public ListCommand ListMe = new ListCommand(this);
	//public SortCommand SortMe = new SortCommand(this);
	public InventoryCommand InvMe = new InventoryCommand(this);
	public ItemDescribeCommand ItmDescMe = new ItemDescribeCommand(this);
	
	public Inventory BeltAndBackPack = new Inventory();
	private Boolean bolQuit = false;
	private String sSortOrder = "";
	private String sUserInput = "";
	private String sCR = System.getProperty("line.separator"); //Carriage Return
	
	
	public static void main(String[] args) {
		
		MyGame mG = new MyGame();
		mG.Run();
		
	}
	
	private void InitializeHelpText()
	{
		for(Commandable c:UserCommands)
		{
			HelpMe.Subscribe(c.getCommandText());
		}
	}

	private void Run()
	{
		this.bolQuit = false;
		InitializeHelpText();
		Scanner inputScanner = new Scanner(System.in);

		UserInterface.UserOutput("Welcome!  You are now playing Escape From Endor!" + sCR + sCR);

		UserInterface.UserOutput(sCR + "You are the AT-ST driver pulled, by Chewbacca, from the AT-ST and commandeered by Chewbacca and two Ewoks and you find yourself lying on the floor of the forest moon" + sCR 
				+ " of Endor not far from the shield generator command bunker. You are injured to a certain degree from your fall have been overlooked by the puny band of filthy rebel forces and Ewoks.  " + sCR 
				+ " You are presumed KIA and forgotten by the captured Imperial Forces. You remain uncaptured and unseen by the Ewoks and rebels when you see the shield generator command bunker fall to rebel forces," + sCR 
				+ " the shield generator destroyed and the Death Star II destroyed as well. \r\n \r\n" + 
				"In order to remain alive and uncaptured with any possibility of returning to remaining Imperial Forces, you must evade capture or death by avoiding Ewoks, rebel forces and rebel forces who are " + sCR 
				+ "arriving after the destruction of Death Star. You need to obtain provisions, a weapon(s), a map, a medical kit, communication equipment and possibly a surface transport in order to survive long enough" + sCR 
				+ " to depart this infested dirtball called a forest moon. \r\n \r\n" + 
				"How will you know where to go? What are your means of departing the forest moon? How will you communicate to remaining Imperial Forces?  If you do NOT have a means of departing the moon " + sCR
				+ "or communicating with remaining Imperial Forces you will surely perish...\r\n" + "\r\n"
				);
		ProcessUserInputCommands("HELP");		
		while( bolQuit == false)
		{
			sUserInput = inputScanner.next();
			this.ProcessUserInputCommands(sUserInput);
				
		}
		UserInterface.UserOutput("The End!");
		inputScanner.close();

	}
	
	private void ProcessUserInputCommands(String UserInput)
	{
		boolean bolCommandExecuted = false;
		
		for(Commandable c:UserCommands)
		{
			bolCommandExecuted = c.matchCommand(UserInput);
			if(bolCommandExecuted)
			{
				c.doCommand(this);
				break;
			}
		}
		
		if(bolCommandExecuted == false)
			{
				UserInterface.UserOutput("Command not recognized");
			}
		
	}

	protected void QuitProgram()
	{
		this.bolQuit = true;
	}
	
	public void Subscribe(Commandable c)
	{
		UserCommands.add(c);
		
	}
	public void setSort(String s)
	{
		sSortOrder = s;
	}
	public String getSort()
	{
		return sSortOrder;
	}
	public String getUserInput()
	{
		return sUserInput;
	}
}

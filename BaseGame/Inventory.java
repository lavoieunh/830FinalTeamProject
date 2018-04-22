package BaseGame;

import java.util.ArrayList;

import UI.UserInterface;

/*
* 	Player Displays Inventory 
		
		The player is able to list the items currently available in the inventory by typing in �inventory�. 
		
		Doing so shows the player the available list of weapons, ammunition, equipment, rations, medical supplies, etc. 
		Typing in the word �describe� then the particular inventory item will provide a description of the item and its use. 
		The player can pick up equipment as described in the equipment user story. The player exits inventory and is prompted to confirm exiting. 
		If the confirmation is not provided, exiting the inventory shall loop until confirmation is provided. 
		
		Player chooses from screen to enter inventory 
		Inventory is grouped by similar items 
		Player chooses item group to view
		Player has the option to describe each item in the inventory 
		Description will include what the item does, and use of item 
		       If player would like to equip item, follow equip item story 
		
		Player can exit inventory view 
		Prompt will confirm exit 
		    If no confirmation given, loop until confirmation provided  
 */

public class Inventory {
	
	private ArrayList<Item> Items; //List of Items in the inventory.
	private Integer iCapacity; //The total number of items that can fit in inventory
	private Integer iEquiptedRight; //stores the index of the item in the Items list in the right hand.
	private Integer iEquiptedLeft; //stores the index of the item in the Items list in the left hand.
	private Integer iEquiptedHead; //Index of item equipted on the head.
	private Integer iEquiptedaChest; //Index of item equipted on the Chest.
	private Integer iEquiptedLegs; //Index of item equipted on the Legs.
	private Integer iEquiptedFeet; //Index of item equipted on the Feet.
	
	
	public Inventory()
	{
		InitializeVarables();
	}
	
	private void InitializeVarables()
	{
		Items = new ArrayList<Item>();
		iCapacity = 5;
	}
	
	public void Add(Item I)
	{
		//The player can pick up equipment as described in the equipment user story.
		Items.add(I);
	}
	
	public void Remove(Item I)
	{
		for(Item inv:Items)
		{
			if(inv.equals(I))
			{
				Items.remove(inv);  //Richard - I don't know if this is going to work. 
				break;
			}
		}
	}
	
	/*
	public void Equip(Item I, String s)
	{
		Items.indexOf(I));  //Richard - I don't know if this will work either.
	}
	*/
	
	public String List()
	{
		/*
		 * The player is able to list the items currently available in the inventory by typing in �inventory�. 
		Doing so shows the player the available list of weapons, ammunition, equipment, rations, medical supplies, etc. 
		 */
		String s = "";
		
		for(Item inv:Items)
		{
			s += "Name: " + inv.getName() + System.getProperty("line.separator");
			s += "Damage: " + inv.getDamage() + System.getProperty("line.separator");
			s += "Remaining Uses: " + inv.getDamage() + System.getProperty("line.separator");
		}
		
		return s;
	}
	
	public String Describe(Item I)
	{
		/*
		 * Typing in the word �describe� then the particular inventory item will provide a description of the item and its use. 
		 */
		String s = "";
		
		for(Item inv:Items)
		{
			if(inv.equals(I))
			{
				s += "Descriptoin: " + inv.getDescription() + System.getProperty("line.separator");
				break;
			}
			
		}
		return s;	
		
	}
	
	public void OpenInventory()
	{
		
		
		String Output = "";
		
		Output = "Inventory:" + System.getProperty("line.separator");
		Output += "Commands: List, Describe, Equip, ";
		UserInterface.UserOutput(Output);
	}
	
}
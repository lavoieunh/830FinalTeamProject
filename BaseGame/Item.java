package BaseGame;

public class Item {
	
/*
* 	Player Displays Inventory 
		
		The player is able to list the items currently available in the inventory by typing in “inventory”. 
		Doing so shows the player the available list of weapons, ammunition, equipment, rations, medical supplies, etc. 
		Typing in the word “describe” then the particular inventory item will provide a description of the item and its use. 
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
	
	
	public Item(String Name, String Description, Integer DPS, Integer UseCount, boolean equipStatus)
	{
		setName(Name);
		setDescription(Description);
		setDamage(DPS);
		setNumberOfUses(UseCount);
		setEquipStatus(equipStatus);
		
	}
	
	private String sName = "";
	private String sDescription = "";
	private Integer DamagePerSecond = 0; //Negative numbers provide defense "armor" against damage
	private Integer NumberOfUses = -1; //-1 is unlimited
	boolean equipStatus;
	
	
	public String getName()
	{
		return sName;
	}
	public void setName(String Name)
	{
		sName = Name;
	}
	
	public String getDescription()
	{
		return sDescription;
	}
	public void setDescription(String Desc)
	{
		sDescription = Desc;
	}
	
	public Integer getDamage()
	{
		return DamagePerSecond;
	}
	public void setDamage(Integer Damage)
	{
		DamagePerSecond = Damage;
	}
	
	public void setEquipStatus(boolean EquipStatus) {
		equipStatus = EquipStatus;
	}
	
	boolean getEquipStatus() {
		return equipStatus;
	}
	
	public void setUses(Integer NUses)
	{
		NumberOfUses = NUses;
		
	}
	
	public void setNumberOfUses(Integer ItemUseCount)
	{
		NumberOfUses = ItemUseCount;
	}
	
	public Integer getNumberOfUses()
	{
		return NumberOfUses;
	}
	
	public void UseItem()
	{
		if(NumberOfUses >= 1)
		{
			NumberOfUses--;
		}
		if(NumberOfUses == 0)
		{
			//remove from inventory
		}
	}
}
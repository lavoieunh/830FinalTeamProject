package BaseGame;

import java.util.Scanner;

public class EquipItem {
	
	Scanner input = new Scanner(System.in);
	/*Player equips item User Story 

	
	Method 1 - Player can view items to equip from inventory 
	
	Method 2 - Playery can preview item to equip from inventory, and a brief description of what each item does 
	
	Method 4 - Player can unequip item from main inventory page 
	     If item not equipped, return error, “item needs to be equipped” 
	
	Method 3 - Player can have only one item 
	    If more than one item equipped, return error “Cannot choose more than one item” 

	Method 3 - Player confirms item choice 
	   If player does not confirm item choice, return error “Please confirm item choice” 

	*/
	
	//Method 1 - Allows the user to display current inventory. See User Story.
	void displayInventory(Inventory inv) {
		inv.List(); // List the items in the inventory
	}
	
	//Method 2 - Allows the user to see the description of the item prior to equipping it.
	void getItemDesc(Item itm) {
		itm.getDescription();
	}
	
	//Method 3 - Checks to see if the item is in equipped. If yes it does not equip it. If it is not equipped and the user confirms, it equips. 
	void equipItem(Item itm, Inventory inv) {
		//Check to see if the item is already equipped. If it is, do not equip and inform the user. 
		if (itm.equipStatus) {
			System.out.println("You cannot equip " + itm.getName() + ", it is already equipped!");
		} 
		//Get confirmation from the user before equipping. 
		else {
				System.out.println("You are about to equip " + itm.getName() + ", please confirm item choise (yes) (no)?");
			
				String command = input.nextLine().toUpperCase();
			
				if (command.equals("YES")) {
					itm.setEquipStatus(true);;
				}
			
				else if (command.equals("NO")) {
					System.out.println("Item " + itm.getName() + " was not equipped!");
				}
			
				else {
					System.out.println("Invalid Command");
				}
		}
		
		
	}
	
	// Method 4 - Unequips the item if the item is currently equipped.
	void unequipItem(Item itm, Inventory inv) {
		if (itm.equipStatus){
			itm.setEquipStatus(false);
		}
		else {
			System.out.println("Cannot un equip " + itm.getName() + " as it is not eqiupped.");
		}
	}
	
	
	
}

package BaseGame;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.powermock.api.mockito.PowerMockito;

import org.powermock.modules.junit4.PowerMockRunner;

import org.mockito.*;
import org.mockito.Mock;

import org.junit.*;
import org.junit.Assert.*;

import org.hamcrest.core.*;  
import org.hamcrest.core.StringContains;  

import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.matchers.JUnitMatchers;
//import static org.hamcrest.Matchers.is;
//import static org.hamcrest.Matchers.equalTo;

class InventoryTest {
	
	///Inventory tested =  (Inventory.class, "iCapcity"  ) 
	
	/*
	@Test
	public void testInventory()
	{
		Inventory inv = new Inventory();
		assertEquals(inv, inv.InitializeVariables);
		//review how to assign 
	}
	*/
	
	
	@Test
	public void testInitializeVariables() {
		
		ArrayList<Item> Items;
		Items = new ArrayList<Item>();
		Inventory test = new Inventory();
		
		//iCapacity = 5;
		
		//Adding basic items for testing.
		Item i = new Item("Pulse Blaster", "Standard imperial pulse blaster issueed to infantry Stormtroopers as their primary weapon.  "
				+ "Mass produced and woefully inaccurate the empire relies on statistical battle dominance by increasing the cyclical rate which is higher than most weapons of this class.",
				10, -1, false);
		Items.add(i); 
		
		assertThat(i, containsString("Pack"));
		i = new Item("Small Med Pack", "Standard imperial issue medical pack with bacta injection.  "
				+ "While not very pleasent these small bacta injections will keep you from dieing as long as you are not already dead and will stabilize the patient and are intended for self treatment.",
				-2, 1, false);
		Items.add(i);
		
		//Items = Arrays.asList<Item>();
		
	
		
	
	
		
		//iCapacity = 5;
		//Adding basic items for testing.
		Item i = new Item("Pulse Blaster", "Standard imperial pulse blaster issueed to infantry Stormtroopers as their primary weapon.  "
				+ "Mass produced and woefully inaccurate the empire relies on statistical battle dominance by increasing the cyclical rate which is higher than most weapons of this class.",
				10, -1, false);
		Items.add(i);
		i = new Item("Small Med Pack", "Standard imperial issue medical pack with bacta injection.  "
				+ "While not very pleasent these small bacta injections will keep you from dying as long as you are not already dead. It stabilizes the patient, and are intended for self treatment.",
				-2, 1, false);
		Items.add(i);
		
		
		
	}

	
	@Test
	public void testAdd(Item I)
	{
		//The player can pick up equipment as described in the equipment user story.
		Items.add(I);
	}
	
	
	@Test
	public void testRemove(Item I)
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
	
	
	}



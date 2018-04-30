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
	
	
	@Test
	public void testInventory()
	{
		
		testInitializeVariables();
		//assertEquals(inv, inv.InitializeVariables);
	}
	
	
	
	@Test
	public void testInitializeVariables() {
		
		ArrayList<Item> Itemd = new ArrayList<Item>();
		//Inventory test = new Inventory();
		
		
		//iCapacity = 5;
		
		//Adding basic items for testing.
		Item i = new Item("Pulse Blaster", "Standard imperial pulse blaster issueed to infantry Stormtroopers as their primary weapon.  "
				+ "Mass produced and woefully inaccurate the empire relies on statistical battle dominance by increasing the cyclical rate which is higher than most weapons of this class.",
				10, -1, false);
		Itemd.add(i); 
		
		assertEquals(i, ("Blaster"));
		i = new Item("Small Med Pack", "Standard imperial issue medical pack with bacta injection.  "
				+ "While not very pleasent these small bacta injections will keep you from dieing as long as you are not already dead and will stabilize the patient and are intended for self treatment.",
				-2, 1, false);
		Itemd.add(i);
		assertEquals(i, ("Pack"));
		
		
		
		//Items = Arrays.asList<Item>();
		//TO DO 
		//Mock items to be added into asList 
		//Confirm via an assertThat(?) that items are in list 
		//Output the test results println to make sure not failing positive 
		
		
	}

	
	@Test
	public void testAdd()
	{ 
		
		//Inventory invent = new Inventory();
		//The player can pick up equipment as described in the equipment user story.
		Item.add("Blaster"); 
		assertEquals();
		//System.out.println(x);
	}
	


	
	}



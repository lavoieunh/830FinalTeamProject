package BaseGame;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import UI.Commandable;
import UI.MyGame;
import UI.UserInterface;

import static org.junit.Assert.*;
//import static org.junit.

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import junit.framework.TestCase;

import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.*;

public class InventoryCommandTest extends InventoryCommand  {

		@Mock 
		MyGame mockinit;
		
		@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
		
		public InventoryCommandTest(MyGame mockinit) {
		mockinit.Subscribe(this);
		// TODO Auto-generated constructor stub
	}

		@Test 
		public void testdoCommand() { 
			//UserInterface.UserOutput(g.BeltAndBackPack.List());
		}
		
		@Test
		public void testmatchCommand( ) { 
			
			String s1 = "yes"; 
			String s2 = "no";
			
			assertEquals(s1, "yes");
			assertEquals(s2, "no"); 
			assertEquals(s1, "no"); 
			assertEquals(s2, "yes"); 
			System.out.println(getCommandText());
			
			//return;
			
			return; //returns true for match and false for no match.
		}

		@Test
		public void testgetCommandText() {
			Inventory tested = new Inventory();
			//return "Inventory"; 
			assertEquals(tested, "Inventory");
			return;
		}
		

}


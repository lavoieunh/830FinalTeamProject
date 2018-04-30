package BaseGame;

import static org.junit.Assert.*;

import org.junit.Test;


import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.*;

public class ItemTest {


        
        @Test
        public void testItem() {
            
            /* 
             //make sure to validate that the items are able to pass tests 
             //nothing is setup to validate this 
             //need to validate setters are working. 
             //Getters work per orig testing 
               
            Item bill = new Item(Name, Description, DPS, UseCount);
            bill.setName("Bob"); 
            
            assertEquals("Bob", bill.getName());
            
            bill.setDescription("Big Description"); 
            assertEquals("Big Description", bill.getDescription()); 
            
            bill.setDamage(4);
            assertEquals(4, bill.getDamage());
            
            bill.setNumberOfUses(8); 
            assertEquals(8, bill.getDPS());
            */
            
        }
        
        private String sName = "";
        private String sDescription = "";
        private Integer DamagePerSecond = 0;
        //private Integer NumberOfUses = -1;
        
            
        @Test 
        public void testsetName() { 
            
            Item bill = new Item(null, null, null, null, false);
            bill.setName("Bob"); 
            
            assertEquals("Bob", bill.getName());
            
            System.out.println(bill.getName()); 
            
            return;
        }
        
        
        @Test
        public void testgetName()
        {
            
            
            return;
        }
        
        
        @Test
        public void testsetDescription()
        {
            Item sdescrip = new Item(null, null, null, null, false);
            sdescrip.setDescription("getter");
            assertEquals("getter", sdescrip.getDescription());
            System.out.println(sdescrip.getDescription());
        
    } 
        
        @Test 
        public void testsetDamage() 
        { 
            
            Item damaging = new Item(null, null, null, null, false); 
            damaging.setDamage(8); 
            assertEquals(8, (int) damaging.getDamage());
            //assertEquals(-1, (int) damaging.getDamage());
            System.out.println(damaging.getDamage());
            
        } 
        
        @Test 
        public void testgetDamage() { 
            
            
        }
		
		
	} 




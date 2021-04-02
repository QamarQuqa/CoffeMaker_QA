package edu.najah.csp.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.exceptions.InventoryException;

public class Testing_AddSuger_InventoryTest {

	@Test()
	public void testAddSugerFive() throws NumberFormatException, InventoryException{
		
		int expected = 20; //After adding 5 units 
		int actual = 0;
		String newUnits = "5" ;
		
		Inventory objInventory = new Inventory();
		objInventory.addSugar(newUnits);	
		actual = objInventory.getSugar();
		System.out.println(objInventory.getSugar());
		assertTrue(expected == actual);	
		
	}
	
	
	@Test()
	public void testAddSugerZero() throws NumberFormatException, InventoryException{
			
			int expected = 15; //After adding 5 units 
			int actual = 0;
			String newUnits = "0" ;
			
			Inventory objInventory = new Inventory();
			objInventory.addSugar(newUnits);
			actual = objInventory.getSugar();
			System.out.println(objInventory.getSugar());
			assertTrue(expected == actual);	
			
		}
	
	@Test(expected = InventoryException.class)
	public void testAddSugerMinus() throws NumberFormatException, InventoryException{
		
		int expected = 20; 
		int actual = 0;
		String newUnits = "-5" ;
		
		Inventory objInventory = new Inventory();
		objInventory.addSugar(newUnits);
		actual = objInventory.getSugar();
		System.out.println(objInventory.getSugar());
		assertTrue(expected == actual);	
		
	}
	

	@Test(expected = NumberFormatException.class)
	public void testAddSugerFLoat() throws NumberFormatException, InventoryException{

			int expected = 16; //After adding 5 units 
			int actual = 0;
			String newUnits = "1.6" ;
			
			Inventory objInventory = new Inventory();
			objInventory.addSugar(newUnits);
			actual = objInventory.getSugar();
			System.out.println(objInventory.getSugar());
			assertTrue(expected == actual);	
			
		}
	
	
	@Test(expected = NumberFormatException.class)
	public void testAddSugerString() throws NumberFormatException, InventoryException{
		
		int expected = 16;  
		int actual = 0;
		String newUnits = "x";
		
		Inventory objInventory = new Inventory();
		objInventory.addSugar(newUnits);
		actual = objInventory.getSugar();
		System.out.println(objInventory.getSugar());
		assertTrue(expected == actual);	
		
	}

}

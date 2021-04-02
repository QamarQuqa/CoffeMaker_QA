package edu.najah.csp.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class Suger_Set_Get_InventoryTest {

	@Test
	public void testGetSugar() {
		
		int expected = 15;
		int actual = 0;
		Inventory objInventory = new Inventory();
		objInventory.setSugar(expected);
		actual = objInventory.getSugar();
		System.out.println(objInventory.getSugar());
		assertTrue(expected == actual);	
		}

	@Test
	public void testSetSugarFive() {
		
		int expected = 5;
		int actual = 0;
		Inventory objInventory = new Inventory();
		objInventory.setSugar(expected);
		actual = objInventory.getSugar();
		System.out.println(objInventory.getSugar());
		assertTrue(expected == actual);	
	}
	
	@Test
	public void testSetSugarZero() {
		
		int expected = 0;
		int actual = -1;
		Inventory objInventory = new Inventory();
		objInventory.setSugar(expected);
		actual = objInventory.getSugar();
		System.out.println(objInventory.getSugar());
		assertTrue(expected == actual);	
	}
	
	
	@Test
	public void testSetSugarMinus() {
		
		int expected = -1;
		int actual = 15;
		Inventory objInventory = new Inventory();
		objInventory.setSugar(expected);
		actual = objInventory.getSugar();
		
		System.out.println(objInventory.getSugar());
		assertFalse(expected == actual);	
		
		//assertTrue(objInventory.getSugar()== actual);
	}


}

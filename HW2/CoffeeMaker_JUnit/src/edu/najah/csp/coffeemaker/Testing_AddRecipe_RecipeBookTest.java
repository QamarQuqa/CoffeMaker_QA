package edu.najah.csp.coffeemaker;

import static org.junit.Assert.*;
import edu.najah.csp.coffeemaker.exceptions.InventoryException;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

import org.junit.Test;

public class Testing_AddRecipe_RecipeBookTest {


    private RecipeBook recipeBook;
    private Recipe recipeTest1;
    private Recipe recipeTest2;

    /*@BeforeEach
    void setUp() throws RecipeException {
        recipeBook = new RecipeBook();
        recipeTest1 = new Recipe();
        recipeTest1.setName("Coffee");
        recipeTest1.setAmtChocolate("0");
        recipeTest1.setAmtCoffee("3");
        recipeTest1.setAmtMilk("1");
        recipeTest1.setAmtSugar("1");
        recipeTest1.setPrice("50");

        recipeTest2 = new Recipe();
        recipeTest2.setName("Tea");
        recipeTest2.setAmtChocolate("0");
        recipeTest2.setAmtCoffee("3");
        recipeTest2.setAmtMilk("1");
        recipeTest2.setAmtSugar("1");
        recipeTest2.setPrice("50");
    }
    
    
	
    
   
        Assertions.assertFalse(recipeBook.addRecipe(recipeTest1));

	int expected = 15; //After adding 5 units 
			int actual = 0;
			String newUnits = "0" ;
			
			Inventory objInventory = new Inventory();
			objInventory.addMilk(newUnits);	
			actual = objInventory.getMilk();
			System.out.println(objInventory.getMilk());
			assertTrue(expected == actual);		

    */
    
    
    
	
	 @Test
	 public void testAddRecipe(){
		 
	    recipeBook = new RecipeBook();
	    Recipe[] recipes = RecipeBook.
	    
	    Assert.assertTrue(recipeBook.addRecipe(recipeTest1));
	    Recipe recipeTest = recipes[0];
	    Assert.assertEquals(recipeTest1, recipeTest);
	    Assert.assertFalse(recipeBook.addRecipe(recipeTest1));
	    }

}

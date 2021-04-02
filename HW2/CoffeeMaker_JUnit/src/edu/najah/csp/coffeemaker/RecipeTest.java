package edu.najah.csp.coffeemaker;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest {

	 public static Recipe recipe;
	 public static Recipe recipe2;
    
    
    @BeforeClass
    public static void setUp() throws RecipeException {
	        recipe = new Recipe();
	        recipe.setAmtChocolate("5");
	        recipe.setAmtCoffee("10");
	        recipe.setAmtMilk("8");
	        recipe.setAmtSugar("7");
	        recipe.setName("re1");
	        recipe.setPrice("50");

	        recipe2 = new Recipe();
	        recipe2.setAmtChocolate("5");
	        recipe2.setAmtCoffee("10");
	        recipe2.setAmtMilk("8");
	        recipe2.setAmtSugar("7");
	        recipe2.setName("re2");
	        recipe2.setPrice("50");
	    }
	
	@Test
	public void testGetAmtChocolatePositiveInt() {
	    assertTrue(5 == recipe.getAmtChocolate());
	}
	
	
	@Test
	public void testSetAmtChocolate()  throws NumberFormatException, RecipeException {
		
		double expected = 5;
		double actual = 0;
		String amtChocolate = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(amtChocolate);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected == actual);	

	}
	
   
	
	@Test(expected = RecipeException.class)
	public void testSetAmtChocolateNegativeNumber()  throws NumberFormatException, RecipeException {
		
		double expected = 5;
		double actual = 0;
		String amtChocolate = "-5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(amtChocolate);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected == actual);	

	}
	
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtChocolateInvalid()  throws NumberFormatException, RecipeException {
		
		double expected = 0;
		double actual = 0;
		String amtChocolate = "b";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(amtChocolate);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected == actual);	

	}
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtChocolateFloat()  throws NumberFormatException, RecipeException {
		
		double expected = 2.5;
		double actual = 0.0;
		String amtChocolate = "2.5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(amtChocolate);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected == actual);	

	}
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtChocolateNoInput()  throws NumberFormatException, RecipeException {
		
		double expected = 0;
		double actual = 0;
		String amtChocolate = "";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(amtChocolate);
		actual = objRecipe.getAmtChocolate();
		assertTrue(expected == actual);	
	}
	
	
//----------------------------------------------------------------------------------------------------	

    @Test
   public void testGetAmtCoffee(){
        assertTrue(10 == recipe.getAmtCoffee());
    }
    
	
	
    @Test
	public void testSetAmtCoffee()  throws NumberFormatException, RecipeException {
		
		double expected = 5;
		double actual = 0;
		String amtCoffee = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected == actual);	

	}
	
    
	
	@Test(expected = RecipeException.class)
	public void testSetAmtCoffeeNegativeNumber()  throws NumberFormatException, RecipeException {
		
		double expected = 5;
		double actual = 0;
		String amtCoffee = "-5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected == actual);	


	}
	
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtCoffeeInvalid()  throws NumberFormatException, RecipeException {
		
		double expected = 0;
		double actual = 0;
		String amtCoffee = "b";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected == actual);	

	}
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtCoffeeFloat()  throws NumberFormatException, RecipeException {
		
		double expected = 2.5;
		double actual = 0.0;
		String amtCoffee = "2.5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected == actual);	

	}
	
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtCoffeeEmptyInput()  throws NumberFormatException, RecipeException {
		
		double expected = 0;
		double actual = 0;
		String amtCoffee = "";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		assertTrue(expected == actual);	
	}
	
	//-------------------------------------------------------------------
	
	
	  @Test
	  public void testGetAmtMilk(){
	        assertTrue(8 == recipe.getAmtMilk());
	    }
	
		
		
		@Test
		public void testSetAmtMilk()  throws NumberFormatException, RecipeException {
			
			double expected = 5;
			double actual = 0;
			String amtMilk = "5";
			
			Recipe objRecipe = new Recipe();
			objRecipe.setAmtMilk(amtMilk);
			actual = objRecipe.getAmtMilk();
			assertTrue(expected == actual);	

		}
		
	   
		
		@Test(expected = RecipeException.class)
		public void testSetAmtMilkNegativeNumber()  throws NumberFormatException, RecipeException {
			
			double expected = 5;
			double actual = 0;
			String amtMilk = "-5";
			
			Recipe objRecipe = new Recipe();
			objRecipe.setAmtMilk(amtMilk);
			actual = objRecipe.getAmtMilk();
			assertTrue(expected == actual);	

		}
		
		
		
		@Test(expected = NumberFormatException.class)
		public void testSetAmtMilkInvalid()  throws NumberFormatException, RecipeException {
			
			double expected = 0;
			double actual = 0;
			String amtMilk = "b";
			
			Recipe objRecipe = new Recipe();
			objRecipe.setAmtMilk(amtMilk);
			actual = objRecipe.getAmtMilk();
			assertTrue(expected == actual);	

		}
		
		
		@Test(expected = NumberFormatException.class)
		public void testSetAmtMilkFloat()  throws NumberFormatException, RecipeException {
			
			double expected = 2.5;
			double actual = 0.0;
			String amtMilk = "2.5";
			
			Recipe objRecipe = new Recipe();
			objRecipe.setAmtMilk(amtMilk);
			actual = objRecipe.getAmtMilk();
			assertTrue(expected == actual);	
		}
		
		
		@Test(expected = NumberFormatException.class)
		public void testSetAmtMilkEmptyInput()  throws NumberFormatException, RecipeException {
			
			double expected = 0;
			double actual = 0;
			String amtMilk = "";
			
			Recipe objRecipe = new Recipe();
			objRecipe.setAmtMilk(amtMilk);
			actual = objRecipe.getAmtMilk();
			assertTrue(expected == actual);	
		}
	  
		
//------------------------------------------------------------------------------------------
		


    @Test
    public void testGetAmtSugar(){
        assertTrue(7 == recipe.getAmtSugar());
    }
  

   
	
	@Test
	public void testSetAmtSugar()  throws NumberFormatException, RecipeException {
		
		double expected = 5;
		double actual = 0;
		String amtSugar = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected == actual);	

	}
	
   
	
	@Test(expected = RecipeException.class)
	public void testSetAmtSugarNegativeNumber()  throws NumberFormatException, RecipeException {
		
		double expected = 5;
		double actual = 0;
		String amtSugar = "-5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected == actual);	

	}
	
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtSugarInvalid()  throws NumberFormatException, RecipeException {
		
		double expected = 0;
		double actual = 0;
		String amtSugar = "b";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected == actual);	

	}
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtSugarFloat()  throws NumberFormatException, RecipeException {
		
		double expected = 2.5;
		double actual = 0.0;
		String amtSugar = "2.5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected == actual);	
	}
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtSugarEmptyInput()  throws NumberFormatException, RecipeException {
		
		double expected = 0;
		double actual = 0;
		String amtSugar = "";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		assertTrue(expected == actual);	
	}
	
	
    //---------------------------------------------------------------------------
	
	
    

    
    @Test
    public void testGetName(){
    		
        assertTrue( recipe.getName().equals("re1"));
    }
    
    
	@Test
    public void testSetName() throws RecipeException{
        recipe.setName("NEW");
        assertTrue("NEW"== recipe.getName());
    }
   
    
    
	@Test(expected = RecipeException.class)
    public void testSetNameNull()throws RecipeException{
        recipe.setName(null);
        assertNotNull(recipe.getName());
    }
    
    //-----------------------------------------------------------------------------------------
	
	
	

    @Test
    public void testGetPrice(){
        assertTrue(50 == recipe.getPrice());
    }
    
   
	
	@Test
	public void testSetPrice()  throws NumberFormatException, RecipeException {
		
		double expected = 55;
		double actual = 0;
		String amtPrice = "55";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		assertTrue(expected == actual);	

	}
	
   
	
	@Test(expected = RecipeException.class)
	public void testSetPriceNegativeNumber()  throws NumberFormatException, RecipeException {
		
		double expected = 55;
		double actual = 0;
		String amtPrice = "-55";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		assertTrue(expected == actual);	

	}
	
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetPriceInvalid()  throws NumberFormatException, RecipeException {
		
		double expected = 0;
		double actual = 0;
		String amtPrice = "b";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		assertTrue(expected == actual);	

	}
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetPriceFloat()  throws NumberFormatException, RecipeException {
		
		double expected = 2.5;
		double actual = 0.0;
		String amtPrice = "2.5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		assertTrue(expected == actual);	
	}
	
	
	@Test(expected = NumberFormatException.class)
	public void testSetPriceEmptyInput()  throws NumberFormatException, RecipeException {
		
		double expected = 0;
		double actual = 0;
		String amtPrice = "";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		assertTrue(expected == actual);	
	}
	
     
	//--------------------------------------------------------------------


    @Test
    public void testToString(){
        assertTrue(recipe.getName() == recipe.toString());
    }
    


    @Test
    public void testHashCode() {
        assertTrue(recipe.hashCode() == recipe2.hashCode());
        assertTrue(recipe.equals(recipe2) && recipe2.equals(recipe));
    }
   


	@Test
    public void testEqualsValid() throws RecipeException {

        Recipe recipe3 = new Recipe();
        recipe3.setAmtChocolate("5");
        recipe3.setAmtCoffee("10");
        recipe3.setAmtMilk("8");
        recipe3.setAmtSugar("7");
        recipe3.setName("name");
        recipe3.setPrice("50");
        assertTrue(recipe == recipe3);

        recipe2 = recipe;
        assertTrue(recipe == recipe2);
    }
    
   
    
    @Test
    public void testEqualsNull(){
        recipe2 = null;
        assertFalse(recipe == recipe2);
    }
   
   
    @Test
    public void testEqualsReturnFalse() throws RecipeException{
        recipe2.setName("new name");
        assertFalse(recipe == recipe2);
    }

   
    @Test
    public void testEqualsGetClass() throws RecipeException{

        Inventory inv = new Inventory();
        assertFalse(recipe.equals(inv));
    }

}

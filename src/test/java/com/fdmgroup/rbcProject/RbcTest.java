package com.fdmgroup.rbcProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RbcTest {
	
	Controller controller = new Controller();
	Fruit fruit = new Fruit(null, 0);
			
	@Test
	public void testWhenFindPriceOfFruitThatDoesNotExist_ReturnsPriceOfZero(){
		
		int result = controller.findPrice("");
		
		assertEquals(0, result);
	}
	
	@Test
	public void testWhenFindPriceOfOranges_ReturnsPriceOfSixty(){
		
		int result = controller.findPrice("Oranges");
		
		assertEquals(60, result);
	}

	@Test
	public void testWhenYesIsInputtedToValidate_ReturnsTrue(){
		
		assertTrue(controller.validate("yes"));
	}
	
	@Test
	public void testWhenNoIsInputtedToValidate_ReturnFalse(){
		
		assertFalse(controller.validate("no"));
	}
	
	@Test
	public void testWhenStringContainingIntegerAreInputtedToValidate_ReturnFalse(){
		
		assertFalse(controller.validate("123"));
	}
	
	@Test
	public void testWhenQuantityOfZeroAdded_ReturnsTotalPriceOfZero(){
		
		double result = controller.findTotalPrice(50, 0, 0.0);
		
		assertEquals(result, 0, 0.0);
	}
	
	@Test
	public void testWhenQuantityOfOneAddedWithPriceOfFifty_ReturnsTotalPriceOfFifty(){
		
		double result = controller.findTotalPrice(50, 1, 0.0);
		
		assertEquals(result, 50, 0.0);
	}
	
	@Test
	public void testWhenQuantityOfMinusOneAdded_ReturnsTotalPriceOfZero(){
		
		double result = controller.findTotalPrice(50, -1, 0.0);
		
		assertEquals(result, 0, 0.0);
	}
	
	@Test
	public void testWhenQuantityOfOneThousandAndOneOneAdded_ReturnsTotalPriceOfZero(){
		
		double result = controller.findTotalPrice(50, 1001, 0.0);
		
		assertEquals(result, 0, 0.0);
	}

	@Test
	public void testWhenQuantityOfTenAddedWithPriceOfFifty_ReturnsTotalPriceOf500(){
		
		double result = controller.findTotalPrice(50, 10, 0.0);
		
		assertEquals(result, 500, 0.0);
	}
	
	@Test
	public void testWhenNoItemsAddedWithTotalPriceOfFifty_ReturnsTotalPriceOfFifty(){
		
		double result = controller.findTotalPrice(50, 0, 50.0);
		
		assertEquals(result, 50, 0.0);
	}
	
	@Test
	public void testWhenOneItemWithAPriceOfFiftyAndTotalPriceOfFifty_ReturnsTotalPriceOfOneHundred(){
		
		double result = controller.findTotalPrice(50, 1, 50.0);
		
		assertEquals(result, 100, 0.0);
	}


}

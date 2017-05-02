package com.venkatcafe.bill;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.venkatcafe.bill.model.Item;
import com.venkatcafe.bill.model.ItemTypeEnum;
import com.venkatcafe.bill.BillCalculator;

import junit.framework.TestCase;

/**
 * Unit test for Bill Calculator.
 */
public class BillCalculatorTest extends TestCase
{
	BillCalculator billCalculator;
	List<Item> itemsList;
	
	@Override
	protected void setUp() throws Exception {
		billCalculator = new BillCalculator();  
		itemsList = new ArrayList<Item>();
	}
	
	@Test
	public void testCreateBillCalculatorObj() {
		assertNotNull(billCalculator);
	}
	
	@Test
	public void testWithNull() {
		assertEquals(null, billCalculator.calculateBill(null));		
	}
	
	@Test
	public void testWithEmptyList() {
		billCalculator.calculateBill(itemsList);
		Assert.assertEquals(null, billCalculator.calculateBill(itemsList));		
	}
	
	@Test
	public void testWithColdDrink() {
		itemsList.add(new Item("Cola", ItemTypeEnum.COLD_DRINK, 0.50));
		Assert.assertEquals(new Double(0.50), billCalculator.calculateBill(itemsList));		
	}
	
	@Test
	public void testWithHotDrink() {
		itemsList.add(new Item("Coffee", ItemTypeEnum.HOT_DRINK, 1.00));
		Assert.assertEquals(new Double(1.00), billCalculator.calculateBill(itemsList));		
	}
	
	@Test
	public void testWithColdFood() {
		itemsList.add(new Item("Cheese Sandwich", ItemTypeEnum.COLD_FOOD, 2.00));
		Assert.assertEquals(new Double(2.20), billCalculator.calculateBill(itemsList));		
	}	
	
}

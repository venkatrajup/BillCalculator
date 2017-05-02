package com.venkatcafe.bill;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.venkatcafe.bill.model.Item;

import junit.framework.TestCase;

/**
 * Unit test for Bill Calculator.
 */
public class BillCalculatorTest extends TestCase
{
	@Test
	public void testCreateBillCalculatorObj() {
		BillCalculator bllCalculatorObj = new BillCalculator();
		assertNotNull(bllCalculatorObj);
	}
	
	@Test
	public void testWithNull() {
		BillCalculator billCalculator = new BillCalculator();		
		assertEquals(null, billCalculator.calculateBill(null));		
	}
	
	@Test
	public void testWithEmptyList() {
		BillCalculator billCalculator = new BillCalculator();
		List<Item> itemsList = new ArrayList<Item>();;		
		billCalculator.calculateBill(itemsList);
		Assert.assertEquals(null, billCalculator.calculateBill(itemsList));		
	}	
}

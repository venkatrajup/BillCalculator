package com.venkatcafe.bill;

import org.junit.Test;

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
}

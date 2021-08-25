package com.ubuntu.demos;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest1 {
	
	@Test
	public void testAdd() {
		System.out.println("Calculator Test 1");
		Calculator calc = new Calculator();
		
		double result1 = calc.add(100, 10);
		Assert.assertEquals(120, result1, 0);
		
		double result2 = calc.add(200, 10);
		Assert.assertEquals(230, result2, 0);
		
	}

}

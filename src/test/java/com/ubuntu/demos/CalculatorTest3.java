package com.ubuntu.demos;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest3 {
	
	@Test
	public void testAdd() {
		System.out.println("Calculator Test 2");
		Calculator calc = new Calculator();
		double result1 = calc.add(1000, 20);
		Assert.assertEquals(1020, result1, 0);
	}


}

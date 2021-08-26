package com.ubuntu.demos;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest2 {
	
	@Test
	public void testAdd() {
		System.out.println("Calculator Test 3");
		Calculator calc = new Calculator();
		double result1 = calc.add(100, 20);
		Assert.assertEquals(130, result1, 0);
	}

}

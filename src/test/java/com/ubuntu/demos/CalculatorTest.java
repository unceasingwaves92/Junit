package com.ubuntu.demos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
Calculator calc = null;
	
	@BeforeClass
	public static void bfClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void setupCalc() {
		System.out.println("Before");
		calc = new Calculator();
	}
	@After
	public void ClosingCalc() {
		System.out.println("After");
	}

	@Test
	public void testAdd() {
		System.out.println("add() test");

		double result = calc.add(100, 10);
		Assert.assertEquals(120, result, 0);
		
		
		double result1 = calc.add(200, 10);
		Assert.assertEquals(230, result1, 0);
		

	}
	@Test
	public void testSub() {
		System.out.println("sub() test");

		double result = calc.sub(20, 10);
		Assert.assertEquals(10, result, 0);
		
	}
	
	@Test
	public void testMultiply() {
		System.out.println("multiply() test");

		double result = calc.multiply(20, 10);
		Assert.assertEquals(200, result, 0);
		
	}
	
	
}

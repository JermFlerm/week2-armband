package com.utech.ap.Armband;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.utech.ap.iCalculator;

public class iCalculatorTest {
	
	@Test
	public void shouldAddThreePositiveNumbers()
	{
		iCalculator Calculator = new Calculator();
		int result = Calculator.add(3, 4, 5);
		assertEquals(12, result, 0);
	}
}

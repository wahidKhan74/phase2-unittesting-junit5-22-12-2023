package com.simplilearn.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArCalculatorParametrisedTest {

	private ArCalculator arCalculator = new ArCalculator();
	
	// @CsvSource allows us to express argument lists as comma-separated values.
	@ParameterizedTest(name = "Test Division - {index} :: {0} / {1}  = {2}")
	@CsvSource(value = { "10, 2 , 5" ,  "56, 7, 8" , "7, 7, 1", "700, 70, 10"}, ignoreLeadingAndTrailingWhitespace = true)
	void testDivisionWithParameters(double dividend, double divisor , double aResult) {
		assertEquals(aResult, arCalculator.divide(dividend, divisor));
	}
	
	// TODO : WA PT for all arithmetic operation
}

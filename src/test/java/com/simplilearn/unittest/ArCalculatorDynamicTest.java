package com.simplilearn.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class ArCalculatorDynamicTest {

	private ArCalculator arCalculator = new ArCalculator();
	// Define input values and expected results based array
	double [][] testCases = {{10, 2, 5} , {12, 3 , 4 } , {8, 4 , 2}, {56 , 7 , 8}};
	
	@TestFactory
	public DynamicTest testDivision() {
		return DynamicTest.dynamicTest("Test divide", ()->{
			double aResult = arCalculator.divide(200, 50);
			double eResult = 4.0;
			assertEquals(aResult, eResult);
		});
	}
	
	@TestFactory
	public Collection<DynamicTest> testDivision2() {
		 return Arrays.asList(testCases).stream().map(testCase ->
			 DynamicTest.dynamicTest("Test divide(" + testCase[0] + ", " + testCase[1] + ")", 
					()->{
					double aResult = arCalculator.divide(testCase[0], testCase[1]);
					double eResult = testCase[2];
					assertEquals(aResult, eResult);
					}))
		.toList();
	}
	
	// TODO : WA DT for all arithmetic operation
}

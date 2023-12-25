package com.simplilearn.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	@DisplayName("Should test default method multiply with +ve values")
	void testMultiply1() {
		
		// create an instance of Calculator with anonymous class implementation
		Calculator calculator = new Calculator() {
			@Override
			public int add(int num1, int num2) {
				return num1+ num2;
			}
		};
		
		int aResult = calculator.multiply(10, 200);
		int eResult = 2000;
		
		assertEquals(eResult, aResult , "Multiplication of 10X20 should be 2000");
	}
	
	@Test
	@DisplayName("Should test default method multiply with 0 and +ve values")
	void testMultiply2() {
		
		// create an instance of Calculator with anonymous class implementation
		Calculator calculator = new Calculator() {
			@Override
			public int add(int num1, int num2) {
				return num1+ num2;
			}
		};
		
		int aResult = calculator.multiply(0, 200);
		int eResult = 0;
		
		assertEquals(eResult, aResult , "Multiplication of 0 X 200 should be 0");
	}
	
	@Test
	@DisplayName("Should test default method multiply with -ve and +ve values")
	void testMultiply3() {
		
		// create an instance of Calculator with anonymous class implementation
		Calculator calculator = new Calculator() {
			@Override
			public int add(int num1, int num2) {
				return num1+ num2;
			}
		};
		
		int aResult = calculator.multiply(-10, 200);
		int eResult = -2000;
		
		assertEquals(eResult, aResult , "Multiplication of -10 X 200 should be -2000");
	}
}

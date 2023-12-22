package com.simplilearn.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

// TODO : WAT with TDD for all possible use case for retirement calculator.
public class RetirementCalculatorTest {

AgeCalculator ageCalculator;
	
	@BeforeEach
	public void setUp() {
		ageCalculator  = new AgeCalculator();
	}

	@AfterEach
	public void cleanUp() {
		if(ageCalculator!=null)
			ageCalculator = null;
	}
	
}

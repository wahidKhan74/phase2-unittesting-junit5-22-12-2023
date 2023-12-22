package com.simplilearn.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Age calculator")
public class AgeCalculatorTest {

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
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	public void test1() {
		int eResult = 33;
		int aResult = ageCalculator.calculateAge(1990);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for -ve year")
	public void test2() {
		 assertEquals(0, ageCalculator.calculateAge(-1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for 0 year")
	public void test3() {
		 assertEquals(0, ageCalculator.calculateAge(0));
	}
	
	@Test
	@DisplayName("Should return 0 age for +ve future year")
	public void test4() {
		assertEquals(0, ageCalculator.calculateAge(2050));
	}
}

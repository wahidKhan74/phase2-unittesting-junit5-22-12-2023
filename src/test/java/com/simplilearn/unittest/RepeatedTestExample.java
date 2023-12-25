package com.simplilearn.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestExample {

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
	
	@RepeatedTest(4)
	@Test
	@DisplayName("Should return valid age for +ve year")
	public void test1() {
		int eResult = 33;
		int aResult = ageCalculator.calculateAge(1990);
		assertEquals(eResult, aResult);
	}
	
	@RepeatedTest(value = 3, name = "{displayName} - repetition - {currentRepetition} of {totalRepetitions} ")
	@Test
	@DisplayName("Calculate Test")
	public void test2() {
		assertEquals(33, ageCalculator.calculateAge(1990));
		assertEquals(30, ageCalculator.calculateAge(1993));
	}
	
	
	@RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
	@Test
	@DisplayName("Age Calculate LONG NAME")
	public void test3() {
		assertEquals(33, ageCalculator.calculateAge(1990));
		assertEquals(30, ageCalculator.calculateAge(1993));
	}
	
	@RepeatedTest(value = 2, name = RepeatedTest.SHORT_DISPLAY_NAME)
	@Test
	@DisplayName("Age Calculate SHORT NAME")
	public void test4() {
		assertEquals(33, ageCalculator.calculateAge(1990));
		assertEquals(30, ageCalculator.calculateAge(1993));
	}
}

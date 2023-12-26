package com.simplilearn.unittest.metaann;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.simplilearn.unittest.AgeCalculator;

public class TestMetaAnnotations {

	AgeCalculator ageCalculator = new AgeCalculator();
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	@Tag("positive")
	public void test1() {
		int eResult = 33;
		int aResult = ageCalculator.calculateAge(1990);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for -ve year")
	@Tag("negative")
	public void test2() {
		 assertEquals(0, ageCalculator.calculateAge(-1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for 0 year")
	@Tag("negative")
	public void test3() {
		 assertEquals(0, ageCalculator.calculateAge(0));
	}
	
	@Test
	@DisplayName("Should return 0 age for +ve future year")
	@Tag("negative")
	@Tag("positive")
	public void test4() {
		assertEquals(0, ageCalculator.calculateAge(2050));
	}
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	@Tag("positive")
	public void test5() {
		int eResult = 32;
		int aResult = ageCalculator.calculateAge(1991);
		assertEquals(eResult, aResult);
		// assertEquals(28, ageCalculator.calculateAge(1995));
	}
	
}

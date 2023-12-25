package com.simplilearn.unittest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTestExample {

	
	@ParameterizedTest(name = "Test - {index} ::  {0} is even")
	@ValueSource(ints = { 2, 4, 10 , 12})
	void testTrueForEventNumber(int number) {
		assertTrue(number%2 ==0 , "Even Number");
	}
	
	
	@ParameterizedTest(name = "Test - {index} :: {0} is a palindrome")
	@ValueSource(strings = { "POP", "12321", "MADAM", "MALAYALAM"})
	void testPalindrome(String word) {
		assertTrue(isPalindrome(word));
	}
	
	// @CsvSource allows us to express argument lists as comma-separated values.
	@ParameterizedTest(name = "Test - {index} :: {0} is valid name and {1} is valid age")
	@CsvSource(value = { "Alex, 30", "Ram, 29", "Prajval, 20"}, ignoreLeadingAndTrailingWhitespace = true)
	void testWithCsvSource(String name, int age) {
		assertNotNull(name);
		assertTrue(age > 0);
	}
	
	
	
	
	private  boolean isPalindrome(String word) {
		if(word==null)
			return false;
		else
			return StringUtils.reverse(word).equals(word);
	}
	
}

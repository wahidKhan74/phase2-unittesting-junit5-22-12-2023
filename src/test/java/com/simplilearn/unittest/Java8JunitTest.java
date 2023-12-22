package com.simplilearn.unittest;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName("The Java8 functionality Junit")
public class Java8JunitTest {

	@Test
	@DisplayName("Sum of numbers with Java 8 Lambda expression")
	public void lambdaExpressionTest() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int eResult = 15;
		int aResult = numbers.stream().mapToInt(Integer:: intValue).sum();
		assertEquals(eResult, aResult);
	}
	
	@Test
	@DisplayName("Sum of numbers should be greater than 5")
	public void lambdaExpressionTest2() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int eResult = 5;
		assertTrue(numbers.stream().mapToInt(Integer:: intValue).sum() > eResult);
		assertTrue(numbers.stream().mapToInt(Integer:: intValue).sum() > eResult , ()-> "Sum should be greater than 5");
	}
	
	@Test
	@DisplayName("Group Assertions")
	public void lambdaExpressionTest3() {
		int[] numbers = {0, 1, 20, 3, 40};
		assertAll("Numbers" , ()-> assertEquals(numbers[0], 0));
		assertAll("Numbers" , ()-> assertEquals(numbers[2], 20));
		assertAll("Numbers" , ()-> assertEquals(numbers[2], 20) , ()-> assertEquals(numbers[4], 40));
		assertAll("Numbers" , 
				()-> assertEquals(numbers[2], 20), 
				()-> assertEquals(numbers[4], 40),
				()-> assertEquals(numbers[3], 3)
				);
	}
}

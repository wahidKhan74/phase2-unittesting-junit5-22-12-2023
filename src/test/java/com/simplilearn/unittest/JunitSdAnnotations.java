package com.simplilearn.unittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The standard annotations for Junit")
public class JunitSdAnnotations {
	
	// Junit Fixture
	@BeforeEach
	public void setUp() {
		System.out.println("--- Before each is executed. ---");
	}
	
	@AfterEach
	public void cleanUp() {
		System.out.println("--- After each is executed. ---");
	}

	@BeforeAll
	public static void setUpAll() {
		System.out.println("--- Before All test is executed. ---");
	}
	
	@AfterAll
	public static void cleanUpAll() {
		System.out.println("--- After All test is executed. ---");
	}
	
	@Test
	@DisplayName("Test One")
	public void testOne() {
		System.out.println("--- Test One is executed. ---");
	}
	
	@Test
	@DisplayName("Test Two")
	public void testTwo() {
		System.out.println("--- Test Two is executed. ---");
	}
	
	@Test
	@DisplayName("Test Three")
	public void testThree() {
		System.out.println("--- Test Three is executed. ---");
	}
}

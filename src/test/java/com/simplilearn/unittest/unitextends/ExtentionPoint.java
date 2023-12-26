package com.simplilearn.unittest.unitextends;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ExtentionPoint {
	
	@BeforeEach
	public void setUp() throws Exception{
		System.out.println("-- ExtentionPoint Class :: @BeforeEach --");
	}
	
	@AfterEach
	public void tearDown() throws Exception{
		System.out.println("-- ExtentionPoint Class :: @AfterEach --");
	}
	
	@BeforeAll
	public static void setUpClass() {
		System.out.println("-- ExtentionPoint Class :: @BeforeAll --");
	}
	
	@AfterAll
	public static void tearDownClass() {
		System.out.println("-- ExtentionPoint Class :: @AfterAll --");
	}

	@Nested
	public class DefaultTestLifeCycle {

		@BeforeEach
		public void setUp() throws Exception{
			System.out.println("-- DefaultTestLifeCycle Class :: @BeforeEach --");
		}
		
		@AfterEach
		public void tearDown() throws Exception{
			System.out.println("-- DefaultTestLifeCycle Class :: @AfterEach --");
		}
		
		
		
		@Test
		public void testOne() {
			System.out.println("-- DefaultTestLifeCycle Class :: Test One --");
		}
		
		@Test
		public void testTwo() {
			System.out.println("-- DefaultTestLifeCycle Class :: Test Two --");
		}
	}

	@Test
	public void testThree() {
		System.out.println("-- ExtentionPoint Class :: Test Three --");
	}
}

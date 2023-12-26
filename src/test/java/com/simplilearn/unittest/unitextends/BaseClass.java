package com.simplilearn.unittest.unitextends;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ExtentionPackageClass.class)
public class BaseClass {

	@BeforeEach
	public void setUp() throws Exception{
		System.out.println("-- Base Class :: @BeforeEach --");
	}
	
	@AfterEach
	public void tearDown() throws Exception{
		System.out.println("-- Base Class :: @AfterEach --");
	}
	
	@BeforeAll
	public static void setUpClass() {
		System.out.println("-- Base Class :: @BeforeAll --");
	}
	
	@AfterAll
	public static void tearDownClass() {
		System.out.println("-- Base Class :: @AfterAll --");
	}
	
	@Test
	@Fast
	public void testOne() {
		System.out.println("-- Base Class :: Test One --");
	}
}

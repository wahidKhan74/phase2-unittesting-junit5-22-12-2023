package com.simplilearn.unittest.unitextends;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubTestClass extends BaseClass {

	@Override
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("-- Sub Class :: @BeforeEach --");
	}

	@Override
	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("-- Sub Class :: @AfterEach --");
	}

	@BeforeAll
	public static void setUpClass() {
		System.out.println("-- Sub Class :: @BeforeAll --");
	}
	
	@AfterAll
	public static void tearDownClass() {
		System.out.println("-- Sub Class :: @AfterAll --");
	}
	
	@Test
	void testTwo() {
		System.out.println("-- Sub Class :: Test Two --");
	}

}

package com.simplilearn.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssumeAppTest {

	AgeCalculator ageCalculator;

	@BeforeEach
	public void setUp() {
		ageCalculator = new AgeCalculator();
	}

	@AfterEach
	public void cleanUp() {
		if (ageCalculator != null)
			ageCalculator = null;
	}

	@Test
	public void testOnDev() {
		// set an system property as ENV key.
		System.setProperty("ENV", "DEV");
		// validation test with assumption that env is dev.
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}

	@Test
	public void testOnQA() {
		// set an system property as ENV key.
		System.setProperty("ENV", "DEV");
		// validation test with assumption that env is dev.
		Assumptions.assumeFalse("QA".equals(System.getProperty("ENV")));
	}

	@Test
	public void testOnProd() {
		// set an system property as ENV key.
		System.setProperty("ENV", "PROD");
		// validation test with assumption that env is dev.
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumeAppTest::message);
		// test will be aborted bcz the assumption failed.
	}

	@Test
	public void testInAllEnvs() {
		// set an system property as ENV key.
		System.setProperty("ENV", "DEV");
		
		assumingThat("DEV".equals(System.getProperty("ENV")), ()-> {
			 // perform these assertions only on the DEV env
			assertEquals(33, ageCalculator.calculateAge(1990));
		});
		
		// perform these assertions in all environments
		assertEquals(29, ageCalculator.calculateAge(1994));
	}

	private static String message() {
		return ":: Test Assumption Failed :: ";
	}
}

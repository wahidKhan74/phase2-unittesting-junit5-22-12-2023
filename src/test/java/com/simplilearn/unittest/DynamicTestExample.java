package com.simplilearn.unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {

	// Test with on DynamicNode Response
	@TestFactory
	public DynamicTest dynamicTestWithDynamicTest() {
		return DynamicTest.dynamicTest("Addition Test", () -> {
			assertEquals(200, Math.addExact(100, 100));
		});
	}

	@TestFactory
	public Collection<DynamicTest> dynamicTestWithCollection() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Addition Test +ve", () -> {
					assertEquals(200, Math.addExact(100, 100));
				}),
				DynamicTest.dynamicTest("Addition Test -ve and +ve", () -> {
					assertEquals(200, Math.addExact(-200, 400));
				}),				
				DynamicTest.dynamicTest("Addition Test 0 and +ve", () -> {
					assertEquals(400, Math.addExact(0, 400));
				}),
				DynamicTest.dynamicTest("Addition Test -ve and -ve", () -> {
					assertEquals(-200, Math.addExact(-100, -100));
				})			
		);		
	}
	
	@TestFactory
	public Iterable<DynamicTest> dynamicTestWithIterable() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Addition Test", () -> {
					assertEquals(200, Math.addExact(100, 100));
				}),
				DynamicTest.dynamicTest("Multiplication Test", () -> {
					assertEquals(10000, Math.multiplyExact(100, 100));
				})	
		);		
	}
	
	@TestFactory
	public Stream<DynamicTest> dynamicTestWithStream() {
		return IntStream.iterate(0, n -> n+2).limit(10)
				.mapToObj(n -> 
				DynamicTest.dynamicTest("Test Divisible by 2 :: " + n, () -> {
					assertTrue(n%2 ==0);
				})
			);
	}
}

package com.simplilearn.unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class AssertionTest {

	String userName = "Sasidhar";
	int age = 30;
	String email = null;

	Object actual = new Object();
	Object referance = actual;

	int[] aNumbers = new int[] { 10, 20, 30 };
	int[] eNumbers = new int[] { 10, 20, 30 };

	@Test
	@DisplayName("Should match expected and actual")
	public void test1() {
		assertEquals(userName, "Sasidhar");
		assertEquals(age, 30);
	}

	@Test
	@DisplayName("Should be true")
	void shouldBeTrue() {
		assertTrue(true);
		assertTrue(age > 20);
	}

	@Test
	@DisplayName("Should be false")
	void shouldBeFalse() {
		assertFalse(false);
		assertFalse(age < 20);
	}

	@Test
	@DisplayName("Should be null")
	void shouldBeNull() {
		assertNull(email);
	}

	@Test
	@DisplayName("Should be not null")
	void shouldBeNotNull() {
		assertNotNull(userName);
	}

	@Test
	@DisplayName("Should refer to the same object")
	void shouldReferToSameObject() {
		assertSame(referance, actual);
	}

	@Test
	@DisplayName("Should contain the same integers array element")
	void shouldContainSameIntegers() {
		assertArrayEquals(aNumbers, eNumbers);
	}

	@Test
	@DisplayName("Should assert mulple Assertions")
	public void lambdaExpressionTest3() {
		int[] numbers = { 0, 1, 20, 3, 40 };
		assertAll("Numbers", () -> assertEquals(numbers[0], 0));
		assertAll("Numbers", () -> assertEquals(numbers[2], 20));
		assertAll("Numbers", () -> assertEquals(numbers[2], 20), () -> assertEquals(numbers[4], 40));
		assertAll("Numbers", () -> assertEquals(numbers[2], 20), () -> assertEquals(numbers[4], 40),
				() -> assertEquals(numbers[3], 3));
	}

	@Test
	@DisplayName("Should throw the correct exception")
	void shouldThrowCorrectException() {

		assertThrows(NullPointerException.class, () -> {
			throw new NullPointerException();
		});
	}

	@Test
	@DisplayName("Should not throw an exception")
	void shouldNotThrowException() {
		assertDoesNotThrow(()-> {
			// any logic -> should not throw exception
		});
	}
}

package com.bptn.course._12_JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {

	Calculator calc;

	@BeforeAll
	void initialize() {
		calc = new Calculator();
	}
	
	@BeforeEach
	void beforeEachTest() {
		/**
		 * The methods with @BeforeEach are executed one time before each test.
		 */
		System.out.println("@BeforeEach: executed before each test");
	}

	@Test
	void testFindmax() {

		/**
		 * 1,3,4,2
		 */

		// Calculator calc = new Calculator(); //we have initialized it
		int max = calc.findMax(new int[] { 1, 3, 4, 2 });

		int expected = 4;

		assertEquals(expected, max); // (expected, actual) can be overloaded to (expected, actual, "custom message")

		max = calc.findMax(new int[] { 10, 41, 13, 20 });

		expected = 41;
		assertEquals(expected, max, "The output is incorect");
	}

	@Test
	void testFindMaxNegative() {

		/**
		 * 1,3,4,2
		 */

		// Calculator calc = new Calculator();
		int max = calc.findMax(new int[] { -12, -1, -3, -4, -2 });

		int expected = -1;

		assertEquals(expected, max); // (expected, actual) can be overloaded to (expected, actual, "custom message")

		max = calc.findMax(new int[] { -22, -10, -13, -3, -7 });

		expected = -3;
		assertEquals(expected, max, "The output is incorect");
	}

}

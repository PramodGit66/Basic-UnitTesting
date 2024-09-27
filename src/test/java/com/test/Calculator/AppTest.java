package com.test.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest {

	private App calculator = null;

	@BeforeAll
	private void init() {
		calculator = new App();
	}

	@AfterAll
	private void destroy() {
		calculator = null;
	}

	@Test
	public void testAdd() {
		int actualResult = calculator.add(2, 3);
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}
    @Test
	public void testMul() {
		int actualResult = calculator.mul(4, 5);
		int expectedResult = 20;
		assertEquals(expectedResult, actualResult);
	}

}
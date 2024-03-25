package com.dev.explorer;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExplorerApplicationTests {
	ExploringUnitTesting tests=new ExploringUnitTesting();
	@Test
	void test() {
		int actualresult=tests.sumOfNumbers(5);
		int expectedresult=15;
		assertEquals(expectedresult, actualresult);
	}
	
	@Test
	void test2() {
		assertEquals(55, tests.sumOfNumbers(10));
	}
	@Test
	void testZ() {
		assertEquals(0, tests.sumOfNumbers(-10));
		//checking if the expected value is same as the actual answer returned by the method
	}
	
	// import org.junit.jupiter.api.AfterAll;
	// import org.junit.jupiter.api.AfterEach;
	// import org.junit.jupiter.api.BeforeAll;
	// import org.junit.jupiter.api.BeforeEach;
	// @BeforeEach test with this annotation will run before each test
	// @AfterEach test with this annotation will run after every test i.e test2, testX,test
	// @BeforeAll If we have a common configuration that need to be executed before starting any test
	// @AfterAll similar to the above but runs after test
}

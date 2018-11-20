package com.JunitCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestCalculator_junit4 {

	Calculator calc = new Calculator();

	// Before is use for one time Inialization
	@Before
	public void setUp(){
		System.out.println("Before each test case");
	}


	// Before is use for one time set up class before Test suite. BeforeClass is Static mehtod and it is called at start and called only onece
	@BeforeClass
	public static void setUpClass(){
		System.out.println("Before test Suite");
	}


	// After is use for clean up after test case
	@After
	public void cleanUp(){
		System.out.println("After each test case");
	}

	// AfterClass is use for clean up after test suite.It is called only once and at the end of the execution
	@AfterClass
	public static void cleanUpClass(){
		System.out.println("After test suite");
	}

	@Test
	public void addDataSet01() {
		//Calculator calc = new Calculator();
		double result = calc.add(10, 50);
		assertEquals(60.0, result, 0);
	}

	@Test

		public void doNothingTest(){

	}

	@Test
	public void addDataSet02() {
		//Calculator calc = new Calculator();
		double result = calc.add(100, 50);
		assertEquals(150, result, 0);
	}

	@Test
	public void sum(){
		assertEquals(4,calc.addition(2,2));
	}
}

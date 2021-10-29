package com.cg.junitdemo.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyCalcTests {

//	JUnit - testing framework for Java 

	@Test
	public void testGetPi() {
		System.out.println("testGetPi");

		MyCalc calc = new MyCalc();

		double expected = 3.142;
		double actual = calc.getPi();

		assertEquals(expected, actual, 0);
	}

}

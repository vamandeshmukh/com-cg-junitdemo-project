package com.cg.junitdemo.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyCalcTests {

	@Test
	public void testgetPi() {
		System.out.println("testgetPi");
		MyCalc calc = new MyCalc();
		double expected = 3.142;
		double actual = calc.getPi();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testAddNums() {
		System.out.println("testAddNums");
		MyCalc calc = new MyCalc();
		int expected = 30;
		int actual = calc.addNums(10, 20);
		assertEquals(expected, actual);
	}

}

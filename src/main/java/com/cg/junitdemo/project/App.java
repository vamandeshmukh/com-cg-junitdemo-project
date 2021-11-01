package com.cg.junitdemo.project;

public class App {

	public static void main(String[] args) { 

		System.out.println("Start");

		MyCalc myCalc = new MyCalc();

		System.out.println(myCalc.getPi());
		System.out.println(myCalc.addNums(10, 20));

		System.out.println("End");
	}

}

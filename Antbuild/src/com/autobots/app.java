package com.autobots;

import java.util.Scanner;

import com.autobots.*;

public class app {


	
	public static void main(String[] args){
		
		double x = 10;
		double y = 20;
		System.out.println("Existing number: 10 and 20");
		
		System.out.println("RelQuantifiers Project");
		System.out.println("10 > 20: " + RelQuantifiers.greaterThanOrEqualTo(x, y));
		System.out.println("10 < 20: " + RelQuantifiers.lesserThan(x, y));
		System.out.println("===========================================================");
		System.out.println("Calculator Project");
		System.out.println("10 + 20 = " + calculator.addition(x, y));
		System.out.println("10 - 20 = " + calculator.subtract(x, y));
	     

	}
	
}

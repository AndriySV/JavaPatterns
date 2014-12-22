package com.as.behavioral.templateMethod.simpleExample;

import com.as.behavioral.templateMethod.simpleExample.templateMethod.Beverage;


public class Main {
	
	public static void main(String[] args) {
		Beverage beverage;
		
		beverage = new Tea();
		beverage.templateMethod();
		
	}
	
}

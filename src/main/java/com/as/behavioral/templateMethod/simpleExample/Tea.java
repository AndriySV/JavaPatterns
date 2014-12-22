package com.as.behavioral.templateMethod.simpleExample;

import com.as.behavioral.templateMethod.simpleExample.templateMethod.Beverage;

public class Tea extends Beverage {

	@Override
	public void putIngradients() {
		System.out.println("Put tea");
	}

}

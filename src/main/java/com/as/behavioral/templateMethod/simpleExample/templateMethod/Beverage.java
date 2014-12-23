package com.as.behavioral.templateMethod.simpleExample.templateMethod;

public abstract class Beverage {
	
	public void templateMethod(){
		boilWater();
		putIngradients();
		pourWater();
	}

	private void pourWater() {
		System.out.println("The water was poured");
	}

	public abstract void putIngradients();

	private void boilWater() {
		System.out.println("The water was boiled");
	}
	
}
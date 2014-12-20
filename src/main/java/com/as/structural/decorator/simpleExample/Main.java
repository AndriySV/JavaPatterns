package com.as.structural.decorator.simpleExample;

import com.as.structural.decorator.simpleExample.component.Beverage;
import com.as.structural.decorator.simpleExample.component.Coffee;
import com.as.structural.decorator.simpleExample.decorator.Milk;
import com.as.structural.decorator.simpleExample.decorator.Sugar;

public class Main {

	public static void main(String[] args) {
		Beverage coffee;
		
		coffee = new Coffee();
		coffee.description();
		System.out.println();
		
		coffee = new Milk(coffee);
		coffee.description();
		System.out.println();
		
		coffee = new Sugar(coffee);
		coffee.description();
		System.out.println();
		
		coffee = new Sugar(coffee);
		coffee.description();
		System.out.println();
	}

}

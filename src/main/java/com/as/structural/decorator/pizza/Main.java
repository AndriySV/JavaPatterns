package com.as.structural.decorator.pizza;

import com.as.structural.decorator.pizza.base.Calzone;
import com.as.structural.decorator.pizza.base.Salami;
import com.as.structural.decorator.pizza.ingredients.Cheese;
import com.as.structural.decorator.pizza.ingredients.Mushrooms;
import com.as.structural.decorator.pizza.ingredients.Sausage;
import com.as.structural.decorator.pizza.ingredients.Tomato;

public class Main {
	
	public static void main(String[] args) {
		Pizza salami = new Salami();
		
		salami = new Cheese(salami);
		salami = new Sausage(salami);
		salami = new Tomato(salami);
		System.out.println(salami.getDescription() + " $" + salami.cost());
		
		Pizza calzone = new Tomato(new Mushrooms(new Cheese( new Calzone())));
		
		System.out.println(calzone.getDescription() + " $" + calzone.cost());
		
		
	}
}

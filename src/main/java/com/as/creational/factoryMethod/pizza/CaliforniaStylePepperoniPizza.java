package com.as.creational.factoryMethod.pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {

	public CaliforniaStylePepperoniPizza() {
		name = "California Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}

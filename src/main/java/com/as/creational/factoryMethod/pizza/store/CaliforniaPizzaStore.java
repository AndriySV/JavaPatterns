package com.as.creational.factoryMethod.pizza.store;

import com.as.creational.factoryMethod.pizza.CaliforniaStylePepperoniPizza;
import com.as.creational.factoryMethod.pizza.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("pepperoni")) {
			return new CaliforniaStylePepperoniPizza();
		} else {
			 return null;
		}
	}

}

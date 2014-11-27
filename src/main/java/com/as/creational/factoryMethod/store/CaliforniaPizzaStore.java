package com.as.creational.factoryMethod.store;

import com.as.creational.factoryMethod.CaliforniaStylePepperoniPizza;
import com.as.creational.factoryMethod.Pizza;

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

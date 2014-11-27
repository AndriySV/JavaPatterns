package com.as.creational.factory.store;

import com.as.creational.factory.CaliforniaStylePepperoniPizza;
import com.as.creational.factory.Pizza;

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

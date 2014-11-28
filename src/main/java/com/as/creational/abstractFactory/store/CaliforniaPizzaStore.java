package com.as.creational.abstractFactory.store;

import com.as.creational.abstractFactory.CaliforniaStylePepperoniPizza;
import com.as.creational.abstractFactory.Pizza;

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

package com.as.creational.factory.store;

import com.as.creational.factory.NYStyleCheesePizza;
import com.as.creational.factory.NYStyleClamPizza;
import com.as.creational.factory.NYStylePepperoniPizza;
import com.as.creational.factory.NYStyleVeggiePizza;
import com.as.creational.factory.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
	

}

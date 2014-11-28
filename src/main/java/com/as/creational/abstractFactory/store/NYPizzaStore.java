package com.as.creational.abstractFactory.store;

import com.as.creational.abstractFactory.NYStyleCheesePizza;
import com.as.creational.abstractFactory.NYStyleClamPizza;
import com.as.creational.abstractFactory.NYStylePepperoniPizza;
import com.as.creational.abstractFactory.NYStyleVeggiePizza;
import com.as.creational.abstractFactory.Pizza;

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

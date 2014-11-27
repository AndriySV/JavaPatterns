package com.as.creational.factoryMethod.store;

import com.as.creational.factoryMethod.NYStyleCheesePizza;
import com.as.creational.factoryMethod.NYStyleClamPizza;
import com.as.creational.factoryMethod.NYStylePepperoniPizza;
import com.as.creational.factoryMethod.NYStyleVeggiePizza;
import com.as.creational.factoryMethod.Pizza;

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

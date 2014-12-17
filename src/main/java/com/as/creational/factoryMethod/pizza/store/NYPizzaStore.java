package com.as.creational.factoryMethod.pizza.store;

import com.as.creational.factoryMethod.pizza.NYStyleCheesePizza;
import com.as.creational.factoryMethod.pizza.NYStyleClamPizza;
import com.as.creational.factoryMethod.pizza.NYStylePepperoniPizza;
import com.as.creational.factoryMethod.pizza.NYStyleVeggiePizza;
import com.as.creational.factoryMethod.pizza.Pizza;

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

package com.as.creational.factoryMethod.pizza.store;

import com.as.creational.factoryMethod.pizza.ChicagoStyleCheesePizza;
import com.as.creational.factoryMethod.pizza.ChicagoStyleClamPizza;
import com.as.creational.factoryMethod.pizza.ChicagoStylePepperoniPizza;
import com.as.creational.factoryMethod.pizza.ChicagoStyleVeggiePizza;
import com.as.creational.factoryMethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
    		return new ChicagoStyleCheesePizza();
	} else if (item.equals("veggie")) {
	    	return new ChicagoStyleVeggiePizza();
	} else if (item.equals("clam")) {
	    	return new ChicagoStyleClamPizza();
	} else if (item.equals("pepperoni")) {
    		return new ChicagoStylePepperoniPizza();
	} else return null;
	}

}

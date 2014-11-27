package com.as.creational.factoryMethod.store;

import com.as.creational.factoryMethod.ChicagoStyleCheesePizza;
import com.as.creational.factoryMethod.ChicagoStyleClamPizza;
import com.as.creational.factoryMethod.ChicagoStylePepperoniPizza;
import com.as.creational.factoryMethod.ChicagoStyleVeggiePizza;
import com.as.creational.factoryMethod.Pizza;

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

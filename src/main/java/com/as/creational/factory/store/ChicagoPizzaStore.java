package com.as.creational.factory.store;

import com.as.creational.factory.ChicagoStyleCheesePizza;
import com.as.creational.factory.ChicagoStyleClamPizza;
import com.as.creational.factory.ChicagoStylePepperoniPizza;
import com.as.creational.factory.ChicagoStyleVeggiePizza;
import com.as.creational.factory.Pizza;

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

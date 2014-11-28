package com.as.creational.abstractFactory.store;

import com.as.creational.abstractFactory.ChicagoStyleCheesePizza;
import com.as.creational.abstractFactory.ChicagoStyleClamPizza;
import com.as.creational.abstractFactory.ChicagoStylePepperoniPizza;
import com.as.creational.abstractFactory.ChicagoStyleVeggiePizza;
import com.as.creational.abstractFactory.Pizza;

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

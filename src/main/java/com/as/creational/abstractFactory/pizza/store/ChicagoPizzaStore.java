package com.as.creational.abstractFactory.pizza.store;

import com.as.creational.abstractFactory.pizza.CheesePizza;
import com.as.creational.abstractFactory.pizza.ClamPizza;
import com.as.creational.abstractFactory.pizza.PepperoniPizza;
import com.as.creational.abstractFactory.pizza.Pizza;
import com.as.creational.abstractFactory.pizza.VeggiePizza;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ChicagoPizzaIngredientFactory;
import com.as.creational.abstractFactory.pizza.ingradientFactory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}

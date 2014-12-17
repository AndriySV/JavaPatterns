package com.as.creational.abstractFactory.pizza.store;

import com.as.creational.abstractFactory.pizza.CheesePizza;
import com.as.creational.abstractFactory.pizza.ClamPizza;
import com.as.creational.abstractFactory.pizza.PepperoniPizza;
import com.as.creational.abstractFactory.pizza.Pizza;
import com.as.creational.abstractFactory.pizza.VeggiePizza;
import com.as.creational.abstractFactory.pizza.ingradientFactory.NYPizzaIngredientFactory;
import com.as.creational.abstractFactory.pizza.ingradientFactory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York  Style  Cheese  Pizza");
			
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		} 
		return pizza;
	}

}

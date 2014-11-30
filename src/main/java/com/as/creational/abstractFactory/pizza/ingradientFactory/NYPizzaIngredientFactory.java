package com.as.creational.abstractFactory.pizza.ingradientFactory;

import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Cheese;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Clams;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Dough;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.FreshClams;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Garlic;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.MarinaraSauce;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Mushroom;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Onion;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Pepperoni;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.RedPepper;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.ReggianoCheese;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Sauce;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.SlicedPepperoni;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.ThinCrustDough;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}

}

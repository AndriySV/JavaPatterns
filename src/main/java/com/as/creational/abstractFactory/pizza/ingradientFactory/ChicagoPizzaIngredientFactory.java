package com.as.creational.abstractFactory.pizza.ingradientFactory;

import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.BlackOlives;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Cheese;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Clams;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Dough;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Eggplant;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.FrozenClams;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.MozzarellaCheese;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Pepperoni;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.PlumTomatoSauce;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Sauce;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.SlicedPepperoni;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Spinach;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.ThickCrustDough;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}

}

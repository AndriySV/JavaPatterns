package com.as.creational.abstractFactory.cake.ingredientsFactory;

import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.Apple;
import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.Cherry;

public interface CakeIngradientFactory {
	
	public Apple createApple();
	
	public Cherry createCherry();
	
}

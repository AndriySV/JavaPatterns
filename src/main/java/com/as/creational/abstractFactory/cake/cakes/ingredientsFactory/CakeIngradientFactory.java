package com.as.creational.abstractFactory.cake.cakes.ingredientsFactory;

import com.as.creational.abstractFactory.cake.cakes.Cake;
import com.as.creational.abstractFactory.cake.cakes.ingredientsFactory.ingredients.Apple;

public interface CakeIngradientFactory {
	
	public Apple createApple();
	
	public Cake createKyiv();
	
}

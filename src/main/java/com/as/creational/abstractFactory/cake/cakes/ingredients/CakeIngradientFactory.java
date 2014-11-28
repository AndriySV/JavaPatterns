package com.as.creational.abstractFactory.cake.cakes.ingredients;

import com.as.creational.abstractFactory.cake.cakes.Cake;

public interface CakeIngradientFactory {
	
	public Apple createApple();
	
	public Cake createKyiv();
	
}

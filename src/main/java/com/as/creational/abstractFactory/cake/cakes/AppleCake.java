package com.as.creational.abstractFactory.cake.cakes;

import com.as.creational.abstractFactory.cake.cakes.ingredients.CakeIngradientFactory;

public class AppleCake extends Cake {
	private CakeIngradientFactory ingradientFactory;
	
	public AppleCake(CakeIngradientFactory ingradientFactory) {
		this.ingradientFactory = ingradientFactory;
	}
	
	public void bake(){
		ingradientFactory.createApple();
	}
	
}

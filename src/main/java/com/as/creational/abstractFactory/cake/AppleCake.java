package com.as.creational.abstractFactory.cake;

import com.as.creational.abstractFactory.cake.ingredientsFactory.CakeIngradientFactory;

public class AppleCake extends Cake {
	private CakeIngradientFactory ingradientFactory;
	
	public AppleCake(CakeIngradientFactory ingradientFactory) {
		this.ingradientFactory = ingradientFactory;
	}
	
	public void bake(){
		ingradientFactory.createApple();
	}
	
}

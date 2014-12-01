package com.as.creational.abstractFactory.cake;

import com.as.creational.abstractFactory.cake.ingredientsFactory.CakeIngradientFactory;

public class CherryCake extends Cake {

	private CakeIngradientFactory ingradientFactory;

	public CherryCake(CakeIngradientFactory ingradientFactory) {
		this.ingradientFactory = ingradientFactory;
	}

	public void bake() {
		ingradientFactory.createCherry();
	}
}

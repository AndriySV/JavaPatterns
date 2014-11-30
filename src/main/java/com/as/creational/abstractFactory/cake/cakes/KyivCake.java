package com.as.creational.abstractFactory.cake.cakes;

import com.as.creational.abstractFactory.cake.cakes.ingredientsFactory.CakeIngradientFactory;

public class KyivCake extends Cake {

	private CakeIngradientFactory ingradientFactory;

	public KyivCake(CakeIngradientFactory ingradientFactory) {
		this.ingradientFactory = ingradientFactory;
	}

	public void bake() {
		ingradientFactory.createKyiv();
	}
}

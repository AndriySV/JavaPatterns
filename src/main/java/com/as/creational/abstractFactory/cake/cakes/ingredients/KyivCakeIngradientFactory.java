package com.as.creational.abstractFactory.cake.cakes.ingredients;

import com.as.creational.abstractFactory.cake.cakes.Cake;

public class KyivCakeIngradientFactory implements CakeIngradientFactory {

	@Override
	public Apple createApple() {
		return new KyivApple();
	}

	@Override
	public Cake createKyiv() {
		// TODO Auto-generated method stub
		return null;
	}

}

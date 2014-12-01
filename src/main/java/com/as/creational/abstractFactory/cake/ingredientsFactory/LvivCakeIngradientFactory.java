package com.as.creational.abstractFactory.cake.ingredientsFactory;

import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.Apple;
import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.Cherry;
import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.LvivApple;
import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.LvivCherry;

public class LvivCakeIngradientFactory implements CakeIngradientFactory {

	@Override
	public Apple createApple() {
		return new LvivApple();
	}

	@Override
	public Cherry createCherry() {
		return new LvivCherry();
	}
}

package com.as.creational.abstractFactory.cake.ingredientsFactory;

import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.Apple;
import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.Cherry;
import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.KyivApple;
import com.as.creational.abstractFactory.cake.ingredientsFactory.ingredients.KyivCherry;

public class KyivCakeIngradientFactory implements CakeIngradientFactory {

	@Override
	public Apple createApple() {
		return new KyivApple();
	}

	@Override
	public Cherry createCherry() {
		return new KyivCherry();
	}

}

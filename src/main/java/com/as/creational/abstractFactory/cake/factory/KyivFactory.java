package com.as.creational.abstractFactory.cake.factory;

import com.as.creational.abstractFactory.cake.cakes.AppleCake;
import com.as.creational.abstractFactory.cake.cakes.Cake;
import com.as.creational.abstractFactory.cake.cakes.KyivCake;
import com.as.creational.abstractFactory.cake.cakes.ingredientsFactory.CakeIngradientFactory;
import com.as.creational.abstractFactory.cake.cakes.ingredientsFactory.KyivCakeIngradientFactory;

public class KyivFactory implements CakeFactory {

	@Override
	public Cake createCacke(String cackeName) {
		Cake cake = null;
		CakeIngradientFactory ingradientFactory = new KyivCakeIngradientFactory();
		
		switch (cackeName) {
		case "apple":
			cake = new AppleCake(ingradientFactory);
			break;
		case "kyiv":
			cake = new KyivCake(ingradientFactory);
			break;
		}
		return cake;
	}

}

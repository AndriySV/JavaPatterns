package com.as.creational.abstractFactory.cake.factory;

import com.as.creational.abstractFactory.cake.cakes.AppleCake;
import com.as.creational.abstractFactory.cake.cakes.Cake;
import com.as.creational.abstractFactory.cake.cakes.ingredients.CakeIngradientFactory;
import com.as.creational.abstractFactory.cake.cakes.ingredients.KyivCakeIngradientFactory;

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
			
			break;
		}
		
		return cake;
	}

}

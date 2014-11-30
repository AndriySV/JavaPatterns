package com.as.creational.abstractFactory.cake.factory;

import com.as.creational.abstractFactory.cake.cakes.AppleCake;
import com.as.creational.abstractFactory.cake.cakes.Cake;
import com.as.creational.abstractFactory.cake.cakes.KyivCake;
import com.as.creational.abstractFactory.cake.cakes.ingredientsFactory.CakeIngradientFactory;
import com.as.creational.abstractFactory.cake.cakes.ingredientsFactory.LvivCakeIngradientFactory;

public class LvivFactory implements CakeFactory {

	@Override
	public Cake createCacke(String cackeName) {
		Cake cake = null;
		CakeIngradientFactory ingradientFactory = new LvivCakeIngradientFactory();
		
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

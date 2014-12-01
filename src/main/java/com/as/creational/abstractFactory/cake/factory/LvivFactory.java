package com.as.creational.abstractFactory.cake.factory;

import com.as.creational.abstractFactory.cake.AppleCake;
import com.as.creational.abstractFactory.cake.Cake;
import com.as.creational.abstractFactory.cake.CherryCake;
import com.as.creational.abstractFactory.cake.ingredientsFactory.CakeIngradientFactory;
import com.as.creational.abstractFactory.cake.ingredientsFactory.LvivCakeIngradientFactory;

public class LvivFactory implements CakeFactory {

	@Override
	public Cake createCacke(String cackeName) {
		Cake cake = null;
		CakeIngradientFactory ingradientFactory = new LvivCakeIngradientFactory();
		
		switch (cackeName) {
		case "apple":
			cake = new AppleCake(ingradientFactory);
			break;
		case "cherry":
			cake = new CherryCake(ingradientFactory);
			break;
		}
		return cake;
	}

}

package com.as.creational.abstractFactory.cake.factory;

import com.as.creational.abstractFactory.cake.AppleCake;
import com.as.creational.abstractFactory.cake.Cake;
import com.as.creational.abstractFactory.cake.CherryCake;
import com.as.creational.abstractFactory.cake.ingredientsFactory.CakeIngradientFactory;
import com.as.creational.abstractFactory.cake.ingredientsFactory.KyivCakeIngradientFactory;

public class KyivFactory implements CakeFactory {

	@Override
	public Cake createCacke(String cackeName) {
		Cake cake = null;
		CakeIngradientFactory ingradientFactory = new KyivCakeIngradientFactory();
		
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

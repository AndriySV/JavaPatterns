package com.as.creational.factoryMethod.cacke.factory;

import com.as.creational.factoryMethod.cacke.cackes.Cacke;
import com.as.creational.factoryMethod.cacke.cackes.LvivStyleAppleCacke;
import com.as.creational.factoryMethod.cacke.cackes.LvivStyleKyivCacke;
import com.as.creational.factoryMethod.cacke.cackes.LvivStylePragueCacke;

public class LvivFactory extends CackeFactory {

	@Override
	public Cacke createCacke(String cackeName) {
		Cacke cacke = null;
		
		switch (cackeName) {
		case "apple":
			cacke = new LvivStyleAppleCacke();
			break;
		case "kyiv":
			cacke = new LvivStyleKyivCacke();
			break;
		case "prague":
			cacke = new LvivStylePragueCacke();
			break;
		}
		
		return cacke;
	}

}

package com.as.creational.factoryMethod.cacke.factory;

import com.as.creational.factoryMethod.cacke.cackes.Cacke;
import com.as.creational.factoryMethod.cacke.cackes.KyivStyleAppleCacke;
import com.as.creational.factoryMethod.cacke.cackes.KyivStyleKyivCacke;
import com.as.creational.factoryMethod.cacke.cackes.KyivStylePragueCacke;

public class KyivFactory extends CackeFactory {

	@Override
	public Cacke createCacke(String cackeName) {
		Cacke cacke = null;
		
		switch (cackeName) {
		case "apple":
			cacke = new KyivStyleAppleCacke();
			break;
		case "kyiv":
			cacke = new KyivStyleKyivCacke();
			break;
		case "prague":
			cacke = new KyivStylePragueCacke();
			break;
		}
		
		return cacke;
	}
}

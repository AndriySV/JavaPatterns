package com.as.creational.factoryMethod.cacke;

import com.as.creational.factoryMethod.cacke.cackes.Cacke;
import com.as.creational.factoryMethod.cacke.factory.CackeFactory;
import com.as.creational.factoryMethod.cacke.factory.KyivFactory;
import com.as.creational.factoryMethod.cacke.factory.LvivFactory;

public class Main {

	public static void main(String[] args) {
		/*Cacke cacke = new KyivStyleKyivCacke();
		Cacke cacke2 = new KyivStyleAppleCacke();
		Cacke cacke3 = new LvivStyleAppleCacke();
		Cacke cacke4 = new LvivStyleKyivCacke();
		
		cacke.bake();
		cacke2.bake();
		cacke3.bake();
		cacke4.bake();*/
		
		CackeFactory kyivFactory = new KyivFactory();
		CackeFactory lvivFactory = new LvivFactory();
		
		Cacke cacke;
		
		cacke = kyivFactory.createCacke("apple");
		cacke.bake();
		
		cacke = kyivFactory.createCacke("kyiv");
		cacke.bake();
		
		cacke = lvivFactory.createCacke("apple");
		cacke.bake();
		
		cacke = lvivFactory.createCacke("kyiv");
		cacke.bake();
		
		cacke = kyivFactory.createCacke("prague");
		cacke.bake();
		
		cacke = lvivFactory.createCacke("prague");
		cacke.bake();
		
	}

}

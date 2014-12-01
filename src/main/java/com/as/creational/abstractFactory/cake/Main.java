package com.as.creational.abstractFactory.cake;

import com.as.creational.abstractFactory.cake.factory.CakeFactory;
import com.as.creational.abstractFactory.cake.factory.KyivFactory;
import com.as.creational.abstractFactory.cake.factory.LvivFactory;

public class Main {

	public static void main(String[] args) {
		
		CakeFactory kyivFactory = new KyivFactory();
		CakeFactory lvivFactory = new LvivFactory();
		
		Cake kyivCake;
		Cake lvivCake;
		
		kyivCake = kyivFactory.createCacke("apple");
		kyivCake.bake();
		
		kyivCake = kyivFactory.createCacke("cherry");
		kyivCake.bake();
		
		lvivCake = lvivFactory.createCacke("apple");
		lvivCake.bake();
		
		lvivCake = lvivFactory.createCacke("cherry");
		lvivCake.bake();
		
	}

}

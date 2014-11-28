package com.as.creational.abstractFactory.cake;

import com.as.creational.abstractFactory.cake.cakes.Cake;
import com.as.creational.abstractFactory.cake.factory.CakeFactory;
import com.as.creational.abstractFactory.cake.factory.KyivFactory;

public class Main {

	public static void main(String[] args) {
		
		CakeFactory kyivFactory = new KyivFactory();
		
		Cake cake = kyivFactory.createCacke("apple");
		cake.bake();
		
	}

}

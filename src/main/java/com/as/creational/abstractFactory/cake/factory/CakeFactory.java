package com.as.creational.abstractFactory.cake.factory;

import com.as.creational.abstractFactory.cake.Cake;

// It's an abstract factory !
public interface CakeFactory {
	
	public Cake createCacke(String cackeName);
	
}
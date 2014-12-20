package com.as.creational.factoryMethod.simpleExample.factory;

import com.as.creational.factoryMethod.simpleExample.product.Book;

public abstract class Creator {

	public abstract Book factoryMethod(String type);
	
}

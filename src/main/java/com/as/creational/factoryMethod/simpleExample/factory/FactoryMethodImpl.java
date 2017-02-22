package com.as.creational.factoryMethod.simpleExample.factory;

import com.as.creational.factoryMethod.simpleExample.product.Book;
import com.as.creational.factoryMethod.simpleExample.product.CEnglish;
import com.as.creational.factoryMethod.simpleExample.product.JavaEnglish;

public class FactoryMethodImpl extends FactoryMethod {

	@Override
	public Book factoryMethod(String type) {

		switch (type) {
		case "java":
			return new JavaEnglish();
		case "c":
			return new CEnglish();
		}
		return null;
	}

}

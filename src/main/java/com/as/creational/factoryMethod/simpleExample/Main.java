package com.as.creational.factoryMethod.simpleExample;

import com.as.creational.factoryMethod.simpleExample.factory.FactoryMethod;
import com.as.creational.factoryMethod.simpleExample.factory.FactoryMethodImpl;
import com.as.creational.factoryMethod.simpleExample.product.Book;

public class Main {

	public static void main(String[] args) {
		FactoryMethod englishBookFactoryMethod = new FactoryMethodImpl();
		
		Book javaEnglish = englishBookFactoryMethod.factoryMethod("java");
		javaEnglish.describe();
		
		Book cEnglish = englishBookFactoryMethod.factoryMethod("c");
		cEnglish.describe();
		
	}

}

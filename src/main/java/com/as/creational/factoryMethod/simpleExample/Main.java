package com.as.creational.factoryMethod.simpleExample;

import com.as.creational.factoryMethod.simpleExample.factory.Creator;
import com.as.creational.factoryMethod.simpleExample.factory.EnglishBookCreator;
import com.as.creational.factoryMethod.simpleExample.product.Book;

public class Main {

	public static void main(String[] args) {
		Creator englishBookCreator = new EnglishBookCreator();
		
		Book javaEnglish = englishBookCreator.factoryMethod("java");
		javaEnglish.describe();
		
		Book cEnglish = englishBookCreator.factoryMethod("c");
		cEnglish.describe();
		
	}

}

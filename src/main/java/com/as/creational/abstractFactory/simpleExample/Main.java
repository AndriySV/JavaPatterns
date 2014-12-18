package com.as.creational.abstractFactory.simpleExample;

import com.as.creational.abstractFactory.simpleExample.abstractFactory.AbstractFactory;
import com.as.creational.abstractFactory.simpleExample.abstractFactory.EnglishBookFactory;
import com.as.creational.abstractFactory.simpleExample.product.Book;

public class Main {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();

		// Eng
		EnglishBookFactory engFactory = (EnglishBookFactory) abstractFactory.getFactoryInstatnce("eng");
		Book book = engFactory.createBook("java");
		
		book.describe();

	}

}

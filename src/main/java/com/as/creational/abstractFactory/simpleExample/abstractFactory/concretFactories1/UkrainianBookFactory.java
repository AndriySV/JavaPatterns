package com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories1;

import com.as.creational.abstractFactory.simpleExample.abstractFactory.AbstractFactory;
import com.as.creational.abstractFactory.simpleExample.product.book.Book;
import com.as.creational.abstractFactory.simpleExample.product.book.ukrBooks.UkrainianBookC;
import com.as.creational.abstractFactory.simpleExample.product.book.ukrBooks.UkrainianBookJava;

public class UkrainianBookFactory extends AbstractFactory implements
		BookFactory {

	@Override
	public Book createBook(String book) {
		switch (book) {
		case "java":
			return new UkrainianBookJava();
		case "c":
			return new UkrainianBookC();
		default:
			throw new RuntimeException("Invalid book name");
		}

	}

}

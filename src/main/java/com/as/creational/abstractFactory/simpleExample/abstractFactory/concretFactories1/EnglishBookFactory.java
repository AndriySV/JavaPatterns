package com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories1;

import com.as.creational.abstractFactory.simpleExample.abstractFactory.AbstractFactory;
import com.as.creational.abstractFactory.simpleExample.product.book.Book;
import com.as.creational.abstractFactory.simpleExample.product.book.engBooks.EnglishBookC;
import com.as.creational.abstractFactory.simpleExample.product.book.engBooks.EnglishBookJava;


public class EnglishBookFactory extends AbstractFactory implements BookFactory {

	@Override
	public Book createBook(String book) {
		switch (book) {
		case "java":
			return new EnglishBookJava();
		case "c":
			return new EnglishBookC();
		default:
			throw new RuntimeException("Invalid book name");
		}
	}

}
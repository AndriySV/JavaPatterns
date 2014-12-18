package com.as.creational.abstractFactory.simpleExample.abstractFactory;

import com.as.creational.abstractFactory.simpleExample.product.Book;
import com.as.creational.abstractFactory.simpleExample.product.IBook;
import com.as.creational.abstractFactory.simpleExample.product.engBooks.EnglishBookC;
import com.as.creational.abstractFactory.simpleExample.product.engBooks.EnglishBookJava;


public class EnglishBookFactory extends AbstractFactory implements IBook {

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

	@Override
	public String createString(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

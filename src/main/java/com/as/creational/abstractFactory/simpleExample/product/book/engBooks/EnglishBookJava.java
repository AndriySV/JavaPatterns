package com.as.creational.abstractFactory.simpleExample.product.book.engBooks;

import com.as.creational.abstractFactory.simpleExample.product.book.Book;

public class EnglishBookJava implements Book {

	@Override
	public void describe() {
		System.out.println("EnglishBookJava");
	}

}

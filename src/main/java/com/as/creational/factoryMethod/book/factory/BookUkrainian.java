package com.as.creational.factoryMethod.book.factory;

import com.as.creational.factoryMethod.book.Book;
import com.as.creational.factoryMethod.book.BookCUkrainian;
import com.as.creational.factoryMethod.book.BookJavaUkrainian;

public class BookUkrainian extends BookFactory {

	@Override
	public Book getBook(String bookName) {
		switch (bookName) {
		case "Java":
			return new BookJavaUkrainian();
		case "C":
			return new BookCUkrainian();
		}
		return null;
	}

}

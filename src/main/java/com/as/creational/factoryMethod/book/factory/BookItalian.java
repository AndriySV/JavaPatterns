package com.as.creational.factoryMethod.book.factory;

import com.as.creational.factoryMethod.book.Book;

public class BookItalian extends BookFactory {

	@Override
	public Book getBook(String bookName) {
		switch (bookName) {
		case "Java":
			return new BookJavaItalian();
		case "C":
			return new BookCItalian();
		}
		return null;
	}

}

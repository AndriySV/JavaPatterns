package com.as.creational.factoryMethod.book.factory;

import com.as.creational.factoryMethod.book.Book;
import com.as.creational.factoryMethod.book.BookCEnglish;
import com.as.creational.factoryMethod.book.BookJavaEnglish;

public class BookEnglish extends BookFactory {

	@Override
	public Book getBook(String bookName) {
		switch (bookName) {
		case "Java":
			return new BookJavaEnglish();
		case "C":
			return new BookCEnglish();
		}
		return null;
	}

}

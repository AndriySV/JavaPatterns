package com.as.creational.factoryMethod.book;

import com.as.creational.factoryMethod.book.factory.BookEnglish;
import com.as.creational.factoryMethod.book.factory.BookFactory;
import com.as.creational.factoryMethod.book.factory.BookItalian;
import com.as.creational.factoryMethod.book.factory.BookUkrainian;

public class Main {

	public static void main(String[] args) {
		BookFactory bookEnglish = new BookEnglish();
		BookFactory bookUkrainian = new BookUkrainian();
		BookFactory bookItalian = new BookItalian();
		
		Book book;
		
		book = bookEnglish.orderBook("Java");
		book.showTitle();
		
		book = bookEnglish.orderBook("C");
		book.showTitle();
		
		book = bookUkrainian.orderBook("Java");
		book.showTitle();
		
		book = bookUkrainian.orderBook("C");
		book.showTitle();
		
		book = bookUkrainian.orderBook("C");
		book.showTitle();
		
		book = bookItalian.orderBook("Java");
		book.showTitle();
	}

}

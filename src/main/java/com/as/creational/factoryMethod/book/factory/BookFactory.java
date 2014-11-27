package com.as.creational.factoryMethod.book.factory;

import com.as.creational.factoryMethod.book.Book;

public abstract class BookFactory {
	
	public abstract Book getBook(String bookName);
	
	public Book orderBook(String bookName){
		System.out.println("Thank you for ordering ! \n"
							+ "Good reading !");
		
		return getBook(bookName);
	}

}

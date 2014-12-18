package com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories1;

import com.as.creational.abstractFactory.simpleExample.product.book.Book;


public interface BookFactory {

	Book createBook(String book);

}

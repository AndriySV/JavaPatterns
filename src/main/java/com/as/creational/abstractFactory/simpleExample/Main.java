package com.as.creational.abstractFactory.simpleExample;

import com.as.creational.abstractFactory.simpleExample.abstractFactory.AbstractFactory;
import com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories1.EnglishBookFactory;
import com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories1.UkrainianBookFactory;
import com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories2.BlackPensilFactory;
import com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories2.RedPensilFactory;
import com.as.creational.abstractFactory.simpleExample.product.book.Book;
import com.as.creational.abstractFactory.simpleExample.product.pensil.Pensil;

public class Main {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();

		// Eng
		EnglishBookFactory engFactory = (EnglishBookFactory) abstractFactory
				.getBookFactory("eng");
		Book book = engFactory.createBook("java");
		book.describe();
		Book book1 = engFactory.createBook("c");
		book1.describe();

		//Ukr
		UkrainianBookFactory ukrFactory = (UkrainianBookFactory) abstractFactory
				.getBookFactory("ukr");
		Book book2 = ukrFactory.createBook("java");
		book2.describe();
		Book book3 = ukrFactory.createBook("c");
		book3.describe();
		
		// Red
		RedPensilFactory redPensilFactory = (RedPensilFactory) abstractFactory.getPansilFactory("red");
		Pensil pensil1 = redPensilFactory.createPensil();
		pensil1.showPensil();
		
		// Black
		BlackPensilFactory blackPensilFactory = (BlackPensilFactory) abstractFactory.getPansilFactory("black");
		Pensil pensil2 = blackPensilFactory.createPensil();
		pensil2.showPensil();
		

	}

}

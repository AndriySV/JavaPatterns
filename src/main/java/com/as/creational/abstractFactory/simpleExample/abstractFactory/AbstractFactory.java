package com.as.creational.abstractFactory.simpleExample.abstractFactory;

public class AbstractFactory {
	
	public AbstractFactory getFactoryInstatnce(String type) {
		switch (type) {
		case "eng":
			return new EnglishBookFactory();
		case "ukr":
			return new UkrainianBookFactory();
		default:
			throw new RuntimeException("Invalid type");
		}
	}
	
	//  factory meth
//	Book createBook(String book);
}

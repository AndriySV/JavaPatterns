package com.as.creational.abstractFactory.simpleExample.abstractFactory;

import com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories1.EnglishBookFactory;
import com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories1.UkrainianBookFactory;
import com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories2.BlackPensilFactory;
import com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories2.RedPensilFactory;

public class AbstractFactory {
	
	public AbstractFactory getBookFactory(String type) {
		switch (type) {
		case "eng":
			return new EnglishBookFactory();
		case "ukr":
			return new UkrainianBookFactory();
		default:
			throw new RuntimeException("Invalid type");
		}
	}
	
	public AbstractFactory getPansilFactory(String type) {
		switch (type) {
		case "red":
			return new RedPensilFactory();
		case "black":
			return new BlackPensilFactory();
		default:
			throw new RuntimeException("Invalid type");
		}
		
	}	

}
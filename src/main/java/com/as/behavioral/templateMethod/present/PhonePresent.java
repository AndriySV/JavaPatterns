package com.as.behavioral.templateMethod.present;

public class PhonePresent extends Present{

	@Override
	void goShop() {
		System.out.println("I go to a shop where PHONES are sold ...");
	}

	@Override
	void makeDecision() {
		System.out.println("I choose the concrete PHONE ...");
	}

}

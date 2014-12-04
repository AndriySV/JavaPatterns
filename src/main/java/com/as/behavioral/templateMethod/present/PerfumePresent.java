package com.as.behavioral.templateMethod.present;

public class PerfumePresent extends Present {

	@Override
	void goShop() {
		System.out.println("I go to a shop where PERFIMES are sold ...");
	}

	@Override
	void makeDecision() {
		System.out.println("I choose the concrete PERFIME ...");
	}
	
	@Override
	boolean needPacking() {
		return true;
	}
}

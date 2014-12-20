package com.as.behavioral.templateMethod.present;

public abstract class Present {

	public final void buyPresent() {
		takeMoney();
		goShop();
		makeDecision();
		buy();
		
		if (needPacking()) {
			packing();
		}
	}

	private void takeMoney() {
		System.out.println("I take some money ...");
	}

	abstract void goShop();

	abstract void makeDecision();

	private void buy() {
		System.out.println("And I buy the present !");
	}
	
	private void packing() {
		System.out.println("I pack this present.");
	}

	boolean needPacking() {
		return false;
	}
	
}

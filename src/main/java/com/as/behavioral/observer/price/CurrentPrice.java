package com.as.behavioral.observer.price;

public class CurrentPrice implements Observer {
	private double price;
	
	public CurrentPrice(PriceData priceData) {
		priceData.registerObserver(this);
	}

	public void update(double price) {
		this.price = price;
		display();
	}
	
	private void display() {
		System.out.println("Current price is: " + price);
		System.out.println("--------------------------");
	}

}

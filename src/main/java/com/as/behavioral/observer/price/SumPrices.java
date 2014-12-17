package com.as.behavioral.observer.price;

public class SumPrices implements Observer {
	private double sum;
	
	public SumPrices(PriceData priceData) {
		priceData.registerObserver(this);
	}
	
	public void update(double price) {
		sum += price;
		display();
	}
	
	public void display() {
		System.out.println("The sum of the prices is: " + sum);
		System.out.println("--------------------------");
	}

}

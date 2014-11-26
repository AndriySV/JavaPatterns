package com.as.behavioral.observer.price;

public class AvaragePrice implements Observer {
	private double avg;
	private double sum;
	private int i = 1;

	public AvaragePrice(PriceData priceData) {
		priceData.registerObserver(this);
	}

	public void update(double price) {
		sum += price;
		avg = (sum)/i;
		i++;
		display();
	}

	public void display() {
		System.out.println("The avarage price is: " + avg);
		System.out.println("--------------------------");
	}
	
}

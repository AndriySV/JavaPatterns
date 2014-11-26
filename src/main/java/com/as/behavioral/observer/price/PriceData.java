package com.as.behavioral.observer.price;

import java.util.ArrayList;

public class PriceData implements Subject {
	private ArrayList<Observer> observers;
	private double price;
	
	public PriceData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void remoteObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(price);
		}
	}
	
	public void setPrice(double price) {
		this.price = price;
		notifyObservers();
	}

}

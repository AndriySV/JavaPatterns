package com.as.behavioral.observer.simpleExample.subject;

import java.util.ArrayList;

import com.as.behavioral.observer.simpleExample.observer.Observer;

public class Integer implements Subject {
	private ArrayList<Observer> observers;
	
	private int a;
	private int b;
	
	public Integer() {
		observers = new ArrayList<Observer>();
		a = 5;
		b = 10;
	}
	
	@Override
	public void registrationObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(a, b);
		}
	}

	public void setNumbers(int a, int b) {
		this.a = a;
		this.b = b;
		
		notifyObserver();
	}
	
}

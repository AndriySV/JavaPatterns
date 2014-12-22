package com.as.behavioral.observer.simpleExample.observer;

import com.as.behavioral.observer.simpleExample.subject.Subject;

public class SumInteger implements Observer {
	private int sum;
	
	public SumInteger(Subject subject) {
		subject.registrationObserver(this);
	}
	
	@Override
	public void update(int a, int b) {
		sum = a + b;
	}
	
	public void display() {
		System.out.println("Sum: " + sum);
	}
	
}
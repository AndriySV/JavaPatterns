package com.as.behavioral.observer.price;

public interface Subject {
	
	public void registerObserver(Observer observer);
	
	public void remoteObserver(Observer observer);
	
	public void notifyObservers();
	
}

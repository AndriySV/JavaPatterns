package com.as.behavioral.observer.weather;

public interface Subject {
	
	public void registerObserver(Observer o);

	public void removeObserver(Observer о);

	public void notifyObservers();
}

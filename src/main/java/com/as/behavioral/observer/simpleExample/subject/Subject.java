package com.as.behavioral.observer.simpleExample.subject;

import com.as.behavioral.observer.simpleExample.observer.Observer;


public interface Subject {
	
	public void registrationObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObserver();
}

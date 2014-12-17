package com.as.creational.singleton.simpleExample;

public class SingletonWithGetInstance {
	private static SingletonWithGetInstance uniqueInstance;
	
	private SingletonWithGetInstance() {
	}
	
	public static SingletonWithGetInstance getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonWithGetInstance();
		}
		return uniqueInstance;
	}
	
}

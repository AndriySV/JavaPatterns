package com.as.creational.singleton.simpleExample;

public class SingletonWithSynchronizedMethod {
	private static SingletonWithSynchronizedMethod uniqueInstance;

	private SingletonWithSynchronizedMethod() {
	}

	public static synchronized SingletonWithSynchronizedMethod getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonWithSynchronizedMethod();
		}
		return uniqueInstance;
	}
}

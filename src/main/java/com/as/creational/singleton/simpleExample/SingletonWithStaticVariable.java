package com.as.creational.singleton.simpleExample;

public class SingletonWithStaticVariable {
	private static SingletonWithStaticVariable uniqueInstance = new SingletonWithStaticVariable();

	private SingletonWithStaticVariable() {
	}

	public static SingletonWithStaticVariable getInstance() {
		return uniqueInstance;
	}

}

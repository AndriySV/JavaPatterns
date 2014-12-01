package com.as.creational.singleton.simpleExample;

public class SingletonWithSynchronizedBlock {
	private static volatile SingletonWithSynchronizedBlock uniqueInstance;

	private SingletonWithSynchronizedBlock() {
	}

	public static SingletonWithSynchronizedBlock getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonWithSynchronizedBlock.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonWithSynchronizedBlock();
				}
			}
		}
		return uniqueInstance;
	}
}

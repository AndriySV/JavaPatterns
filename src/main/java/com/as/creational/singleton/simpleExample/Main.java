package com.as.creational.singleton.simpleExample;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		SingletonWithGetInstance singletonWithGetInstance = SingletonWithGetInstance.getInstance();
		
		SingletonWithStaticVariable withStaticVariable = SingletonWithStaticVariable.getInstance();
				
		SingletonWithSynchronizedMethod withSynchronizedMethod = SingletonWithSynchronizedMethod.getInstance();
		
		SingletonWithSynchronizedBlock withSynchronizedBlock = SingletonWithSynchronizedBlock.getInstance();
	
	}
	
	
}

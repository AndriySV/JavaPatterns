package com.as.behavioral.strategy;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}

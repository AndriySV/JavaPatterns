package com.as.creational.singleton.chocolate;

public class ChocolateBoilerSynchronized {
	private boolean empty;
	private boolean boiled;

	private static ChocolateBoilerSynchronized uniqueInstance;

	private ChocolateBoilerSynchronized() {
		empty = true;
		boiled = false;
	}

	public static synchronized ChocolateBoilerSynchronized getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoilerSynchronized();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}

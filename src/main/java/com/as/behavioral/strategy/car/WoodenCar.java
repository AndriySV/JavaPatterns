package com.as.behavioral.strategy.car;

import com.as.behavioral.strategy.car.driveBehavior.DriveNoWay;
import com.as.behavioral.strategy.car.signalBehavior.SignalNoWay;

public class WoodenCar extends Car {

	public WoodenCar() {
		driveBehavior = new DriveNoWay();
		signalBehavior = new SignalNoWay();
	}

	@Override
	public void display() {
		System.out.println("It's WoodenCar !");
	}
}
package com.as.behavioral.strategy.car;

import com.as.behavioral.strategy.car.driveBehavior.DriveWithHelp;
import com.as.behavioral.strategy.car.signalBehavior.SignalWithHelp;

public class IronCar extends Car {

	public IronCar() {
		driveBehavior = new DriveWithHelp();
		signalBehavior = new SignalWithHelp();
	}
	
	@Override
	public void display() {
		System.out.println("It's iron car !");
	}

}

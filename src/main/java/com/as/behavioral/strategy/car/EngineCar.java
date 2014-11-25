package com.as.behavioral.strategy.car;

import com.as.behavioral.strategy.car.driveBehavior.DriveItself;
import com.as.behavioral.strategy.car.signalBehavior.SignalWithHelp;

public class EngineCar extends Car {

	public EngineCar() {
		driveBehavior = new DriveItself();
		signalBehavior = new SignalWithHelp();
	}
	
	@Override
	public void display() {
		System.out.println("It's EngineCar !");
	}

}
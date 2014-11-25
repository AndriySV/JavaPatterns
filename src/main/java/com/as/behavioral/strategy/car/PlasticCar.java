package com.as.behavioral.strategy.car;

import com.as.behavioral.strategy.car.driveBehavior.DriveWithHelp;
import com.as.behavioral.strategy.car.signalBehavior.SignalWithHelp;

public class PlasticCar extends Car {

	public PlasticCar() {
		driveBehavior = new DriveWithHelp();
		signalBehavior = new SignalWithHelp();
	}
	
	@Override
	public void display() {
		System.out.println("It's PlasticCar !");
	}

}
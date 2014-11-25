package com.as.behavioral.strategy.car;

import com.as.behavioral.strategy.car.driveBehavior.DriveBehavior;
import com.as.behavioral.strategy.car.signalBehavior.SignalBehavior;

public abstract class Car {

	public DriveBehavior driveBehavior;
	public SignalBehavior signalBehavior;
	
	public abstract void display();
	
	public void performDrive() {
		driveBehavior.drive();
	}
	
	public void performSignal() {
		signalBehavior.signal();
	}

	public void setDriveBehavior(DriveBehavior driveBehavior) {
		this.driveBehavior = driveBehavior;
	}

	public void setSignalBehavior(SignalBehavior signalBehavior) {
		this.signalBehavior = signalBehavior;
	}
	
}
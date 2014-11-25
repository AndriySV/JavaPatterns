package com.as.behavioral.strategy.car;

import com.as.behavioral.strategy.car.signalBehavior.SignalNoWay;

public class Main {

	public static void main(String[] args) {
		
		Car enginCar = new EngineCar();
		Car plasticCar = new PlasticCar();
		Car woodenCar = new WoodenCar(); 
		Car ironCar = new IronCar();
		
		enginCar.display();
		enginCar.performDrive();
		enginCar.performSignal();
		System.out.println("----------------------------------------");
		
		plasticCar.display();
		plasticCar.performDrive();
		plasticCar.performSignal();
		System.out.println("----------------------------------------");
		
		System.out.println("After changes !");
		plasticCar.display();
		plasticCar.performDrive();
		plasticCar.setSignalBehavior(new SignalNoWay());
		plasticCar.performSignal();
		System.out.println("----------------------------------------");
		
		woodenCar.display();
		woodenCar.performDrive();
		woodenCar.performSignal();
		System.out.println("----------------------------------------");
		
		ironCar.display();
		ironCar.performDrive();
		ironCar.performSignal();
		System.out.println("----------------------------------------");
		
	}
}
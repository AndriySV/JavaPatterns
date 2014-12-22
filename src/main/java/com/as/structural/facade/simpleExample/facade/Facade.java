package com.as.structural.facade.simpleExample.facade;

import com.as.structural.facade.simpleExample.elements.Computer;
import com.as.structural.facade.simpleExample.elements.Light;
import com.as.structural.facade.simpleExample.elements.TV;

public class Facade {
	
	private TV tv;
	private Light light;
	private Computer computer;

	public Facade(TV tv, Light light, Computer computer) {
		this.tv = tv;
		this.light = light;
		this.computer = computer;
	}
	
	public void watchMovie() {
		tv.on();
		light.off();
		computer.off();
	}
	
	public void endMovie() {
		tv.off();
		light.on();
		computer.on();
	}
	
}
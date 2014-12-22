package com.as.structural.facade.simpleExample;

import com.as.structural.facade.simpleExample.elements.Computer;
import com.as.structural.facade.simpleExample.elements.Light;
import com.as.structural.facade.simpleExample.elements.TV;
import com.as.structural.facade.simpleExample.facade.Facade;

public class Main {

	public static void main(String[] args) {
		TV tv = new TV();
		Light light = new Light();
		Computer computer = new Computer();
		
		Facade facade = new Facade(tv, light, computer);
		
		facade.watchMovie();
		System.out.println("-------------------------------------");
		facade.endMovie();
	}

}

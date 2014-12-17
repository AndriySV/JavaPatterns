package com.as.behavioral.strategy.simpleExample;

import com.as.behavioral.strategy.simpleExample.dynamicContent.CanFly;
import com.as.behavioral.strategy.simpleExample.dynamicContent.CannotFly;
import com.as.behavioral.strategy.simpleExample.dynamicContent.FlyBehavior;
import com.as.behavioral.strategy.simpleExample.staticContent.Duck;
import com.as.behavioral.strategy.simpleExample.staticContent.MallardDuck;
import com.as.behavioral.strategy.simpleExample.staticContent.RubberDuck;
import com.as.behavioral.strategy.simpleExample.staticContent.WoodenDuck;

public class Main {

	public static void main(String[] args) {
		Duck duck;
		FlyBehavior canFly = new CanFly();
		FlyBehavior cannotFly = new CannotFly();
		
		duck = new MallardDuck();
		duck.setFlyBehavior(canFly);
		duck.display();
		
		duck = new RubberDuck();
		duck.setFlyBehavior(cannotFly);
		duck.display();
		
		duck = new WoodenDuck();
		duck.setFlyBehavior(cannotFly);
		duck.display();
	}

}

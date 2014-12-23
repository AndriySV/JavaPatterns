package com.as.behavioral.state.simpleExample.state;

import com.as.behavioral.state.simpleExample.TV;

public class TurnedOffTV implements State {
	private TV tv;
	
	public TurnedOffTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void turnOnTV() {
		System.out.println("TV was turned on !");
		tv.setCurrentState(tv.getTurnedOnTV());
	}

	@Override
	public void switchChanel() {
		System.out.println("Mistake: \n The TV is turned off !");
	}

	@Override
	public void turnOffTV() {
		System.out.println("Mistake: \n The TV is turned off !");
	}

}

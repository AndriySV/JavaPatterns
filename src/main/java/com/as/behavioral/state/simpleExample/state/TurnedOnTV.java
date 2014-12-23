package com.as.behavioral.state.simpleExample.state;

import com.as.behavioral.state.simpleExample.TV;

public class TurnedOnTV implements State {
	private TV tv;
	
	public TurnedOnTV(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void turnOnTV() {
		System.out.println("Mistake: \nThe TV has already turned on !");
	}

	@Override
	public void switchChanel() {
		System.out.println("The chanel was switched !");
	}

	@Override
	public void turnOffTV() {
		System.out.println("The TV was turned off !");
		tv.setCurrentState(tv.getTurnedOffTV());
	}

}
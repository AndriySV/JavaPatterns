package com.as.behavioral.state.simpleExample;

import com.as.behavioral.state.simpleExample.state.State;
import com.as.behavioral.state.simpleExample.state.TurnedOffTV;
import com.as.behavioral.state.simpleExample.state.TurnedOnTV;

public class TV {
	private State turnedOnTV;
	private State turnedOffTV;
	
	private State currentState;
	
	public TV() {
		turnedOnTV = new TurnedOnTV(this);
		turnedOffTV = new TurnedOffTV(this);
		currentState = turnedOffTV;
	}
	
	public void on() {
		currentState.turnOnTV();
	}

	public void switchChanel() {
		currentState.switchChanel();
	}

	public void off() {
		currentState.turnOffTV();
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getTurnedOnTV() {
		return turnedOnTV;
	}

	public State getTurnedOffTV() {
		return turnedOffTV;
	}
	
}
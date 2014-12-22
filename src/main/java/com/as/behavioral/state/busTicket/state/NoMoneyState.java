package com.as.behavioral.state.busTicket.state;

import com.as.behavioral.state.busTicket.BusTicketMachine;

public class NoMoneyState implements State {
	private BusTicketMachine busTicketMachine;
	
	public NoMoneyState(BusTicketMachine busTicketMachine) {
		this.busTicketMachine = busTicketMachine;
	}

	@Override
	public void insertMoney() {
		System.out.println("Money where inserted ...");
		busTicketMachine.setCurrentState(busTicketMachine.getHasMoneyState());
	}

	@Override
	public void ejectMoney() {
		System.out.println("There are no any money ...");
	}

	@Override
	public void buyTicket() {
		System.out.println("The first you need to pay the money ...");
	}

	@Override
	public void perform() {
		System.out.println("The first you need to pay the money ...");
	}

	@Override
	public String toString() {
		return "NoMoneyState";
	}
}

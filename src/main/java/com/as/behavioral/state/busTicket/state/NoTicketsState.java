package com.as.behavioral.state.busTicket.state;

import com.as.behavioral.state.busTicket.BusTicketMachine;

public class NoTicketsState implements State {
	@SuppressWarnings("unused")
	private BusTicketMachine busTicketMachine;
	
	public NoTicketsState(BusTicketMachine busTicketMachine) {
		this.busTicketMachine = busTicketMachine;
	}

	@Override
	public void insertMoney() {
		System.out.println("There is no any ticket ...");
	}

	@Override
	public void ejectMoney() {
		System.out.println("There are no any money ...");
	}

	@Override
	public void buyTicket() {
		System.out.println("There are no any money ...");
	}

	@Override
	public void perform() {
		System.out.println("The first you need to pay the money ...");
	}
	
	@Override
	public String toString() {
		return "NoTicketsState";
	}

}

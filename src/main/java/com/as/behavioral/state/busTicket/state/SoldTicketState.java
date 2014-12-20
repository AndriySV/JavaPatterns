package com.as.behavioral.state.busTicket.state;

import com.as.behavioral.state.busTicket.BusTicketMachine;

public class SoldTicketState implements State {
	private BusTicketMachine busTicketMachine;
	
	public SoldTicketState(BusTicketMachine busTicketMachine) {
		this.busTicketMachine = busTicketMachine;
	}

	@Override
	public void insertMoney() {
		System.out.println("Wait for getting the ticket ...");
	}

	@Override
	public void ejectMoney() {
		System.out.println("Sorry, but you have already bought the ticket ...");
	}

	@Override
	public void buyTicket() {
		System.out.println("Wait for getting the ticket ...");
	}

	@Override
	public void perform() {
		System.out.println("Please, take your ticket ...");
		busTicketMachine.setCount(busTicketMachine.getCount() - 1);
		
		if (busTicketMachine.getCount() > 0) {
			busTicketMachine.setCurrentState(busTicketMachine.getNoMoneyState());
		} else {
			busTicketMachine.setCurrentState(busTicketMachine.getNoTicketsState());
		}
	}
	
	@Override
	public String toString() {
		return "SoldTicketState";
	}

}

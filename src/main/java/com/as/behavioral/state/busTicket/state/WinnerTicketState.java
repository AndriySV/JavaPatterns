package com.as.behavioral.state.busTicket.state;

import com.as.behavioral.state.busTicket.BusTicketMachine;

public class WinnerTicketState implements State {
	private BusTicketMachine busTicketMachine;

	public WinnerTicketState(BusTicketMachine busTicketMachine) {
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
		System.out.println("<<<<YOU ARE A WINNER !>>>>\nYou have won two tickets. Please take their ...");
		busTicketMachine.setCount(busTicketMachine.getCount() - 2);
		
		if (busTicketMachine.getCount() > 0) {
			busTicketMachine.setCurrentState(busTicketMachine.getNoMoneyState());
		} else {
			busTicketMachine.setCurrentState(busTicketMachine.getNoTicketsState());
		}
	}

}

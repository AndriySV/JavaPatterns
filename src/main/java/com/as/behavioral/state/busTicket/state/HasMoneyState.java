package com.as.behavioral.state.busTicket.state;

import java.util.Random;

import com.as.behavioral.state.busTicket.BusTicketMachine;

public class HasMoneyState implements State {
	private BusTicketMachine busTicketMachine;
	
	private Random random = new Random();
	
	public HasMoneyState(BusTicketMachine busTicketMachine) {
		 this.busTicketMachine = busTicketMachine;
	}

	@Override
	public void insertMoney() {
		System.out.println("The money were already iserted ...");
	}

	@Override
	public void ejectMoney() {
		System.out.println("Please, take your money back ...");
		busTicketMachine.setCurrentState(busTicketMachine.getNoMoneyState());
	}

	@Override
	public void buyTicket() {
		System.out.println("The ticket was bought ...");
		int value = random.nextInt(10);
		
		if ((value == 0) && (busTicketMachine.getCount() >= 2)) {
			busTicketMachine.setCurrentState(busTicketMachine.getWinnerTicketState());
		} else {
			busTicketMachine.setCurrentState(busTicketMachine.getSoldTicketState());
		}
	}

	@Override
	public void perform() {
		System.out.println("The first you need to buy ticket ...");
	}

	@Override
	public String toString() {
		return "HasMoneyState";
	}
}

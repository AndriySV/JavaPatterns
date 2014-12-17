package com.as.behavioral.state.busTicket;

public class Main {
	static BusTicketMachine busTicketMachine = new BusTicketMachine(10);
	
	public static void main(String[] args) {
		currentState();
		
		busTicketMachine.buyTicket();
		currentState();
		
		busTicketMachine.insertMoney();
		busTicketMachine.buyTicket();
		currentState();
		
		busTicketMachine.ejectMoney();
		currentState();
		
		busTicketMachine.insertMoney();
		busTicketMachine.insertMoney();
		currentState();
		
		busTicketMachine.buyTicket();
		currentState();
		
		busTicketMachine.ejectMoney();
		currentState();
	}

	private static void currentState() {
		System.out.println("Number of tickets: " + busTicketMachine.getCount() + "\n"
				+ "state: " + busTicketMachine.getCurrentState());
		
		System.out.println();
	}
}

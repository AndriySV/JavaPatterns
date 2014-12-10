package com.as.behavioral.state.busTicket;

import com.as.behavioral.state.busTicket.state.HasMoneyState;
import com.as.behavioral.state.busTicket.state.NoMoneyState;
import com.as.behavioral.state.busTicket.state.NoTicketsState;
import com.as.behavioral.state.busTicket.state.SoldTicketState;
import com.as.behavioral.state.busTicket.state.State;
import com.as.behavioral.state.busTicket.state.WinnerTicketState;

public class BusTicketMachine {
	private State noMoneyState;
	private State hasMoneyState;
	private State soldTicketState;
	private State noTicketsState;
	private State winnerTicketState;
	
	private State currentState = noTicketsState;
	private int count;
	
	public BusTicketMachine(int numberTickets) {
		noMoneyState = new NoMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		soldTicketState = new SoldTicketState(this);
		noTicketsState = new NoTicketsState(this);
		winnerTicketState = new WinnerTicketState(this);
		
		this.count = numberTickets;
		if (numberTickets > 0) {
			currentState = noMoneyState;
		}
	}
	
	public void insertMoney() {
		currentState.insertMoney();
	}
	
	public void ejectMoney() {
		currentState.ejectMoney();
	}
	
	public void buyTicket() {
		currentState.buyTicket();
		currentState.perform();
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public State getCurrentState() {
		return currentState;
	}

	public State getNoMoneyState() {
		return noMoneyState;
	}

	public State getHasMoneyState() {
		return hasMoneyState;
	}

	public State getSoldTicketState() {
		return soldTicketState;
	}

	public State getNoTicketsState() {
		return noTicketsState;
	}

	public State getWinnerTicketState() {
		return winnerTicketState;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}
	
}
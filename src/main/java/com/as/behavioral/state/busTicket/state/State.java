package com.as.behavioral.state.busTicket.state;

public interface State {

	public void insertMoney();
	
	public void ejectMoney();
	
	public void buyTicket();
	
	public void perform();
	
}

package com.as.creational.builder.simpleExample.builder;

public interface Builder {
	
	public void bookBusTicket(String date);
	
	public void bookHotel(String date);
	
	public void bookDinner(String dateTime);
	
	public String getPlan();
}

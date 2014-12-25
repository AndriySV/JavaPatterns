package com.as.creational.builder.simpleExample.builder;

public class TourBuilder implements Builder {
	private String ticket;
	private String hotel;
	private String dinner;

	@Override
	public void bookBusTicket(String date) {
		ticket = "ticket was booked on " + date + "\n";
	}

	@Override
	public void bookHotel(String date) {
		hotel = "hotel was booked on " + date + "\n";
	}

	@Override
	public void bookDinner(String date) {
		dinner = "dinner was booked on " + date + "\n";

	}

	@Override
	public String getPlan() {
		return ticket + hotel + dinner;
	}

}

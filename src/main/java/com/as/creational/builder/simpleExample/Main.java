package com.as.creational.builder.simpleExample;

import com.as.creational.builder.simpleExample.builder.Builder;
import com.as.creational.builder.simpleExample.builder.TourBuilder;

public class Main {

	public static void main(String[] args) {
		Builder builder = new  TourBuilder();
		String plan;
		
		builder.bookBusTicket("26.12.2014");
		builder.bookHotel("27.12.2014");
		
		plan = builder.getPlan();
		System.out.println(plan);
		
		builder.bookBusTicket("29.12.2014");
		builder.bookHotel("29.12.2014");
		builder.bookDinner("31.12.2014");
		
		plan = builder.getPlan();
		System.out.println(plan);
	}

}

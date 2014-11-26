package com.as.structural.decorator.pizza;

public abstract class Pizza {
	
	String description = "Unknown";
	
	public String getDescription() {
		return description;
	}

	public abstract double cost(); 

}

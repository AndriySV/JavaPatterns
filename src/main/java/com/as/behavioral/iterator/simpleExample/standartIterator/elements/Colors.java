package com.as.behavioral.iterator.simpleExample.standartIterator.elements;

import java.util.ArrayList;

public class Colors {
	
	private ArrayList<String> colors;
	
	public Colors() {
		colors = new ArrayList<String>();
	}
	
	public ArrayList<String> getColors() {
		colors.add("red");
		colors.add("white");
		colors.add("black");
		colors.add("grey");
		
		return colors;
	}
		
}
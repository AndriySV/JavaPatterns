package com.as.behavioral.state.simpleExample;

public class Main {

	public static void main(String[] args) {
		
		TV tv = new TV();
		
		tv.on();
		tv.switchChanel();
		tv.off();
		
		tv.switchChanel();
		
		tv.on();
		tv.switchChanel();
	}

}

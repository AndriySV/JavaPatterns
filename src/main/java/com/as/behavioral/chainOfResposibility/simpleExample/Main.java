package com.as.behavioral.chainOfResposibility.simpleExample;

import com.as.behavioral.chainOfResposibility.simpleExample.handler.Handler;
import com.as.behavioral.chainOfResposibility.simpleExample.handler.SpamHandler;

public class Main {

	public static void main(String[] args) {
		Handler handler;
		String condition = "fan";

		handler = new SpamHandler(condition);
		handler.handelRequest();
		
	}

}

package com.as.behavioral.observer.simpleExample;

import com.as.behavioral.observer.simpleExample.observer.DiffInteger;
import com.as.behavioral.observer.simpleExample.observer.SumInteger;
import com.as.behavioral.observer.simpleExample.subject.Integer;

public class Main {

	public static void main(String[] args) {
		Integer integer = new Integer();
		
		SumInteger  sumInteger = new SumInteger(integer);
		DiffInteger diffInteger = new DiffInteger(integer);
		
		integer.setNumbers(10, 5);
		sumInteger.display();
		diffInteger.display();
		
		integer.setNumbers(13, 7);
		sumInteger.display();
		diffInteger.display();
		
	}

}

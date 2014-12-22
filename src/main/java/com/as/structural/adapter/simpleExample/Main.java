package com.as.structural.adapter.simpleExample;

import com.as.structural.adapter.simpleExample.adapter.Adapter;
import com.as.structural.adapter.simpleExample.duck.Duck;
import com.as.structural.adapter.simpleExample.duck.MallardDuck;
import com.as.structural.adapter.simpleExample.turkey.WildTurkey;

public class Main {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.flyDuck();
		
		WildTurkey wildTurkey = new WildTurkey();
		
		Duck adapter = new Adapter(wildTurkey);
		adapter.flyDuck();
	}

}
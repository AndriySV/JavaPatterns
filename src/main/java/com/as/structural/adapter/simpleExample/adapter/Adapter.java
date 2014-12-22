package com.as.structural.adapter.simpleExample.adapter;

import com.as.structural.adapter.simpleExample.duck.Duck;
import com.as.structural.adapter.simpleExample.turkey.WildTurkey;

public class Adapter implements Duck {
	private WildTurkey wildTurkey;

	public Adapter(WildTurkey wildTurkey) {
		this.wildTurkey = wildTurkey;
	}

	@Override
	public void flyDuck() {
		wildTurkey.flyTurkey();
	}
}

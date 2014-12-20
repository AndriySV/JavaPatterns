package com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories2;

import com.as.creational.abstractFactory.simpleExample.abstractFactory.AbstractFactory;
import com.as.creational.abstractFactory.simpleExample.product.pensil.BlackPensil;
import com.as.creational.abstractFactory.simpleExample.product.pensil.Pensil;

public class BlackPensilFactory extends AbstractFactory implements PensilFactory {

	@Override
	public Pensil createPensil() {
		return new BlackPensil();
	}

}

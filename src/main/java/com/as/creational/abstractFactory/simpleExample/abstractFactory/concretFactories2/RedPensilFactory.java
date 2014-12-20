package com.as.creational.abstractFactory.simpleExample.abstractFactory.concretFactories2;

import com.as.creational.abstractFactory.simpleExample.abstractFactory.AbstractFactory;
import com.as.creational.abstractFactory.simpleExample.product.pensil.Pensil;
import com.as.creational.abstractFactory.simpleExample.product.pensil.RedPensil;

public class RedPensilFactory extends AbstractFactory implements PensilFactory {

	@Override
	public Pensil createPensil() {
		return new RedPensil();
	}

}

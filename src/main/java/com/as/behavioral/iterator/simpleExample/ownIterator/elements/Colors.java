package com.as.behavioral.iterator.simpleExample.ownIterator.elements;

import com.as.behavioral.iterator.simpleExample.ownIterator.iterator.ColorsIterator;
import com.as.behavioral.iterator.simpleExample.ownIterator.iterator.Iterator;

public class Colors implements ColorsInterface {
	
	String[] colors = {"red", "white", "black", "grey"};
	
	public Iterator	createIterator() {
		return new ColorsIterator(colors);
	}
	
}

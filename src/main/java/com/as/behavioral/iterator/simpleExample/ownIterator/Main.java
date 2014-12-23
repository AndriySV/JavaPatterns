package com.as.behavioral.iterator.simpleExample.ownIterator;

import com.as.behavioral.iterator.simpleExample.ownIterator.elements.Colors;
import com.as.behavioral.iterator.simpleExample.ownIterator.iterator.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Colors colors = new Colors();
		
		Iterator iterator = colors.createIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

package com.as.behavioral.iterator.simpleExample.standartIterator;

import java.util.Iterator;

import com.as.behavioral.iterator.simpleExample.standartIterator.elements.Colors;

public class Main {

	public static void main(String[] args) {

		Colors colors = new Colors();

		Iterator<String> iterator = colors.getColors().iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
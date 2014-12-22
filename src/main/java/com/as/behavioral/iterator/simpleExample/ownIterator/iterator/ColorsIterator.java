package com.as.behavioral.iterator.simpleExample.ownIterator.iterator;

public class ColorsIterator implements Iterator {
	private String[] colors;
	private int index;
	private String color;
	
	public ColorsIterator(String[] colors) {
		this.colors = colors;
	}

	@Override
	public String next() {
		color = colors[index];
		index ++;
		return color;
	}

	@Override
	public boolean hasNext() {
		if (index < colors.length && index >= 0) {
			return true;
		} else {
			return false;
		}
	}

}

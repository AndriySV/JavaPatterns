package com.as.structural.composite.simpleExample.component;

public class Leaf implements Component {
	private String chapter;
	
	public Leaf(String chapter) {
		this.chapter = chapter;
	}

	@Override
	public void add(Component component) {
		new UnsupportedOperationException();
	}

	@Override
	public void remove(Component component) {
		new UnsupportedOperationException();
	}

	@Override
	public Component getChild(int i) {
		return null;
	}

	@Override
	public void showAll() {
		System.out.println("chapter: " + chapter);
	}

}
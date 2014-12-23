package com.as.structural.composite.simpleExample.component;

public interface Component {

	public void add(Component component);
	
	public void remove(Component component);

	public Component getChild(int i);
	
	public void showAll();
}

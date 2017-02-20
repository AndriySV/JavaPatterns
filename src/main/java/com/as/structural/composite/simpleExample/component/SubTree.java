package com.as.structural.composite.simpleExample.component;

import java.util.ArrayList;
import java.util.Iterator;

public class SubTree implements Component {
	private String chapter;
	private ArrayList<Component> chapters;

	public SubTree(String chapter) {
		this.chapter = chapter;
		chapters = new ArrayList<Component>(); 
	}
	
	@Override
	public void add(Component component) {
		chapters.add(component);
	}

	@Override
	public void remove(Component component) {
		chapters.remove(component);
	}

	@Override
	public Component getChild(int i) {
		return chapters.get(i);
	}

	@Override
	public void showAll() {
		System.out.println("chapter: " + chapter);
		
		Iterator<Component> iterator = chapters.iterator();
		
		while (iterator.hasNext()) {
			Component subTree = iterator.next();
			
			subTree.showAll();
		}
	}

}

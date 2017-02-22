package com.as.structural.flyweight.simpleExample.flyweight;

import com.as.structural.flyweight.simpleExample.Tree;

public class TreeManager implements Flyweight {
	private String[][] trees;
	private Tree tree;
	
	public TreeManager(String[][] trees, Tree tree) {
		this.tree = tree;
		this.trees = trees;
	}

	@Override
	public void displayTree() {
		for (String[] parametr : trees) {
			tree.display(parametr[0], parametr[1]);
		}
	}

}

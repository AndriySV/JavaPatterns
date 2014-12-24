package com.as.structural.flyweight.simpleExample;

import com.as.structural.flyweight.simpleExample.flyweight.ConcreteFlyweight;
import com.as.structural.flyweight.simpleExample.flyweight.Flyweight;

public class Main {

	public static void main(String[] args) {
		String[][] trees = {{"1", "1"}, {"2", "2"}, {"3", "3"} };
		Tree tree = new Tree();
		
		Flyweight flyweight = new ConcreteFlyweight(trees, tree);
		flyweight.displayTree();
	}

}

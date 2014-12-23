package com.as.structural.composite.simpleExample;

import com.as.structural.composite.simpleExample.component.Component;
import com.as.structural.composite.simpleExample.component.Leaf;
import com.as.structural.composite.simpleExample.component.SubTree;

public class Main {

	public static void main(String[] args) {
		Component allChapters = new SubTree("The title of the book");
		
		Component chapter1 = new SubTree("1");
		Component chapter11 = new SubTree("11");
		Component chapter12 = new SubTree("12");
		
		Component chapter2 = new Leaf("2");
		
		chapter1.add(chapter11);
		chapter1.add(chapter12);
		
		allChapters.add(chapter1);
		allChapters.add(chapter2);
		
		chapter1.showAll();
		System.out.println();
		
		chapter2.showAll();
		System.out.println();
		
		allChapters.showAll();
				
	}

}

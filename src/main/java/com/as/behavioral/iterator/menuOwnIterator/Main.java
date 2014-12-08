package com.as.behavioral.iterator.menuOwnIterator;

public class Main {

	
	public static void main(String[] args) {
		
		DinerMenu dinerMenu = new DinerMenu();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		
		Iterator iterator = dinerMenu.createIterator();
		
		iterator = pancakeHouseMenu.createIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}
	
	
}

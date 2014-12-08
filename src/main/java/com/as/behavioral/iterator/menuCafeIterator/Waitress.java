package com.as.behavioral.iterator.menuCafeIterator;

import java.util.ArrayList;
import java.util.Iterator;
  
public class Waitress {
	ArrayList<Menu> menu;
	
	public Waitress(ArrayList<Menu> menu) {
		this.menu = menu;
	}
 
	public void printMenu() {
		Iterator<Menu> iterator = menu.iterator();
		
		while (iterator.hasNext()) {
			Menu menu = iterator.next();
			printMenu(menu.createIterator());
			
		}
	}
 
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
		System.out.println();
	}
 
}
//^^ WaitressCafeMain
//^^ WaitressCafe

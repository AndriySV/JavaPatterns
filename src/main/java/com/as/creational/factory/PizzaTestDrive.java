package com.as.creational.factory;

import com.as.creational.factory.store.ChicagoPizzaStore;
import com.as.creational.factory.store.NYPizzaStore;
import com.as.creational.factory.store.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered  а " +  pizza.getName()  +  "\n"); 

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered  а " +  pizza.getName()  +  "\n"); 
		
	}

}

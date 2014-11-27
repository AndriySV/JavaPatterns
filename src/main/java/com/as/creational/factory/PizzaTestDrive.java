package com.as.creational.factory;

import com.as.creational.factory.store.CaliforniaPizzaStore;
import com.as.creational.factory.store.ChicagoPizzaStore;
import com.as.creational.factory.store.NYPizzaStore;
import com.as.creational.factory.store.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaPizza = new CaliforniaPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered  а " +  pizza.getName()  +  "\n"); 

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered  а " +  pizza.getName()  +  "\n"); 
		
		Pizza pizza2 = californiaPizza.orderPizza("pepperoni");
		System.out.println("Andrii ordered  а " +  pizza2.getName()  +  "\n"); 
		
	}

}

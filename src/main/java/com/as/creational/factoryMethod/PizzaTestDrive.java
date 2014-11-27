package com.as.creational.factoryMethod;

import com.as.creational.factoryMethod.store.CaliforniaPizzaStore;
import com.as.creational.factoryMethod.store.ChicagoPizzaStore;
import com.as.creational.factoryMethod.store.NYPizzaStore;
import com.as.creational.factoryMethod.store.PizzaStore;

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

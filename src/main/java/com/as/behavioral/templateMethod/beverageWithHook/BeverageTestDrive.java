package com.as.behavioral.templateMethod.beverageWithHook;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		TeaWithHook tea = new TeaWithHook();
		CoffeeWithНook coffee = new CoffeeWithНook();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

	}
}

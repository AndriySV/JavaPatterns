package com.as.behavioral.templateMethod.present;

public class Main {

	public static void main(String[] args) {
		Present phone = new PhonePresent();
		Present perfume = new PerfumePresent();
		
		phone.buyPresent();
		System.out.println();
		
		perfume.buyPresent();
	}

}

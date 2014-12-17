package com.as.behavioral.observer.price;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		PriceData priceData = new PriceData();
		
		CurrentPrice currentPrice = new CurrentPrice(priceData);
		SumPrices sumPrices = new SumPrices(priceData);
		AvaragePrice avaragePrice = new AvaragePrice(priceData);
		
		priceData.setPrice(20);
		priceData.setPrice(10);
		priceData.setPrice(6);
		
	}
}
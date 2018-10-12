package com.fdmgroup.rbcProject;

public class Fruit {

	private String fruitName;
	private double price;
	
	public Fruit(String fruitName, double price) {
		super();
		this.fruitName = fruitName;
		this.price = price;
	}

	public double getPrice(String fruitName) {
		
		if(fruitName.equals("Oranges")){
			return 60;
		}
		if(fruitName.equals("Apples")){
			return 65;
		}
		if(fruitName.equals("Bananas")){
			return 70;
		}
		if(fruitName.equals("Pears")){
			return 75;
		}
		if(fruitName.equals("Lemons")){
			return 80;
		}
		
		return 0;
	}

	
}

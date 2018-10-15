package com.fdmgroup.rbcProject;

public class Controller {
	
	static Fruit fruit = new Fruit(null, 0);
	
	public Integer findPrice(String fruitName){
		
			Integer price = (int) fruit.getPrice(fruitName);
			
			if(price==0 || price==null){
				System.out.println("Invalid fruit name is selected, please try again!");
				return 0;
			}
			System.out.println("The price for this fruit is: "+price+" pence");
			return price;
	}
		
	public boolean validate(String input){
		if(input.equals("yes")){
			return true;
		}
		else{
			System.out.println("Your order has been aborted");
			return false;
		}
	}

	public Double findTotalPrice(int price, int quantity, double totalPrice){
		if(quantity<0){
			System.out.println("The quantity cannot be negative!");
			return 0.0;
		}
		if(quantity==0 && totalPrice > 0){
			System.out.println("You have added nothing to your basket!");
			return totalPrice;
		}
		if(quantity==0 && totalPrice == 0){
			System.out.println("You have added nothing to your basket!");
			return 0.0;
		}
		if(quantity>1000){
			System.out.println("Please enter a number between 1 and 1000");
			return 0.0;
		}
		double output =  totalPrice + ( price * quantity );
		return output;
	}
}

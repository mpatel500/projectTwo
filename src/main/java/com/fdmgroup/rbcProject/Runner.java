package com.fdmgroup.rbcProject;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Runner {
	
	static Fruit fruit = new Fruit(null, 0);
	

	public static void main(String[] args) {

		Controller controller = new Controller();
		
		Double totalPrice = 0.0;
		NumberFormat formatter = new DecimalFormat("#0.00");     
		
		while(true){
			
			System.out.println("Please select a fruit to purchase (Apples/Oranges/Pears/Lemons/Bananas)");
			Scanner userInput = new Scanner(System.in);
			String fruitName = userInput.nextLine();
			
			Integer price = controller.findPrice(fruitName);
			
			if(price==0){
				continue;
			}
			
			
			System.out.println("Please select the quantity of food that you wish to purchase");
			
			while (!userInput.hasNextInt()) {
		        System.out.println("That's not a number!");
		        userInput.next();
			}
			
			Integer quantity = userInput.nextInt();
			
			totalPrice = controller.findTotalPrice(price, quantity, totalPrice);
			System.out.println("The total price is: £"+formatter.format(totalPrice*0.01));
			
			System.out.println("Do you wish to purchase more fruit? (type 'yes' to continue, type 'no' to checkout, type anything abort order)");
			String input = userInput.next();
			
			if(input.equals("no")){
				System.out.println("The total price of your order is: £"+formatter.format(totalPrice*0.01));
				System.out.println("Thank you for using this system!");
				break;
			}
			
			if(controller.validate(input)==false){
				break;
			}
			
			
		}
		
		
	}
	

	
		

}



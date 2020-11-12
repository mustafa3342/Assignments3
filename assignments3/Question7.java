package assignments3;

public class Question7 {
	/*
	 * Question-7

	   Write a program that determines the change to be dispensed from a vending machine. 
	   An item in the machine can cost between 25 cents and 1 dollar, 
	   in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
	   and the machine accepts only a single dollar bill to pay for the item.

       Sample output

       Price in cents : 95

       Your change is 0 quarters, 0 dimes, and 1 nickles
	 */

	public static void main(String[] args) {
		
		int cost = 95;
		int change = 100 - cost;		
		int quarters = change / 25;
		int remain1 = change % 25;
		int dimes = remain1 / 10;
		int remain2 = remain1 % 10;
		int nickles = remain2 / 5;
		System.out.println("Your change is " + quarters + " quarters " + dimes + " dimes, and " + nickles + " nickles");
	
		

	}

}

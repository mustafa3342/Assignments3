package assignments3;

import java.util.Scanner;

public class Question5 {
	/*
	 *   Question-5

		 Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.
		
		-Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds
		
		-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
		-Assign values to the hours, minutes, seconds variables
		-Display the result

         Sample Output:

         inputSecond is 3695

         1 hours, 1 minutes, and 35 seconds
	 */

	public static void main(String[] args) {
		
		int hours, minutes, seconds, result;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int inputSecond = scan.nextInt();
		hours = inputSecond / 3600;
		int remain1 = inputSecond % 3600;
		minutes = remain1 / 60;
		seconds = remain1 % 60;
		
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	
	}

}

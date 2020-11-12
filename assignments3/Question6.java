package assignments3;

import javax.swing.text.AbstractDocument.LeafElement;

public class Question6 {
	/*
	 *  Question-6

		Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
		
		Write a program with a variable that holds the number of milligrams of caffeine in a drink and 
		outputs how many drinks it takes to kill a person.

        Sample Output

        Number of milligrams in drink: 500
        It would take about 20 drinks for a lethal overdose
	 */

	public static void main(String[] args) {
		
		int caffeineNumber = 500; // mg
		
		int lethalOverdose = 10*1000; // convert --> 1 g = 1000 mg
		
		int drinksNumber =  lethalOverdose / caffeineNumber;
		
		System.out.println(drinksNumber);
		

	}

}

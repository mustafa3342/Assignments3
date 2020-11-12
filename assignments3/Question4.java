package assignments3;

public class Question4 {
	/*
	 *  Question-4

		Declare 2 variables (Num1, Num2)
		
		Swap values between Num1 and Num2
		
		Display new values of Num1 and Num2

        Sample output:

        n1=10
        n2=20

        ----------

        n1=20
        n2=10
	 */

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int a;
		a = n1;
		n1 = n2;
		n2 = a;
				
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);
	}

}

package DeliverableUno;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		
		int numberOne;
		int numberTwo;
		String numberAsString;
		int another1 = 0;
		int another2 = 0;
		int i;
		
		
		System.out.println("Enter a number:");
		numberOne = input.nextInt();  // user inputs number
		System.out.println("Enter another number:"); //user inputs another number
		numberTwo = input.nextInt();
		
		
				
		numberAsString = Integer.toString(numberOne);
		int numDigis = numberAsString.length();
		
		for (i=0; i < numDigis; ++i) {
			if (another1 == another2) {
				another1 = numberOne % 10 + numberTwo % 10;
				numberOne = numberOne / 10;
				numberTwo = numberTwo / 10;
				another2 = numberOne % 10 + numberTwo % 10;
			}
			else {
				System.out.println("False");
				break;
			}
		}
		if (i == numDigis) {  // if i is the same as numDigis, then "True" prints.
			System.out.println("True");
		}
	}
}


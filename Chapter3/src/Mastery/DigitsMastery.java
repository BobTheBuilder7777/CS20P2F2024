package Mastery;

import java.util.Scanner;

public class DigitsMastery {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter a 3 digit number: ");
		int user_numb = userInput.nextInt();
		
	
		
		System.out.println("The number you have entered is " + user_numb + ".");
		
		int hundreds_place = user_numb / 10;
		hundreds_place /= 10;
		
		System.out.println("The hundreds place digit is: " + hundreds_place + ".");
		
		int tens_place = user_numb / 10;
		tens_place %= 10;
		
		System.out.println("The hundreds place digit is: " + tens_place + ".");
		
		int ones_place = user_numb % 10;
		
		System.out.println("The ones place digit is: " + ones_place + ".");
		
	}


}


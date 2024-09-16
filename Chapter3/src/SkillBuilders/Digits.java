package SkillBuilders;

import java.util.*;

public class Digits {
	
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter a 2 digit number: ");
		int user_numb = userInput.nextInt();
		
	
		
		System.out.println("The number you have entered is " + user_numb + ".");
		
		int tens_place = user_numb / 10;
		
		System.out.println("The tens place digit is: " + tens_place + ".");
		
		int ones_place = user_numb % 10;
		
		System.out.println("The ones place digit is: " + ones_place + ".");
		
	}

}

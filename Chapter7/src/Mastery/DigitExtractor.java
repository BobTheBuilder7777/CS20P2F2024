

package Mastery;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// import for user input
		
		
	
		String choice;
		
		System.out.print("Enter an integer: ");
		Digit digit = new Digit(input.nextInt()); //variable name linking to other class
		
		
		while (true)
		{	
		
		System.out.println("Show (W)hole number.");
		System.out.println("Show (O)nes place number.");
		System.out.println("Show (T)ens place number.");
		System.out.println("Show (H)undreds place number.");
		System.out.println("(Q)uit");
		
		
		
		System.out.println(" ");
		System.out.println("Enter your choice");
		
		choice = input.next();
		choice = choice.toLowerCase();
		
	
			if (choice.equals("w"))
			{
				System.out.println(digit.Whole());
			}
			if (choice.equals("h"))
			{
				System.out.println(digit.Hundreds());
			}
			if (choice.equals("t"))
			{
				System.out.println(digit.tens());
			}
			if (choice.equals("o"))
			{
				System.out.println(digit.ones());
			}
			
			if (choice.equals("q"))
			{
				break;
			}
		}


		
		
		
		
		

	}

}

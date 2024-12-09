/*

Program: DigitExtractor.java          Date: November 25th, 2024

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays the ones, tens, and hundreds digit of the number.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// import for user input
		
		
	
		String choice; //declare choice variable
		
		System.out.print("Enter an integer: "); //prompt user for integer
		Digit digit = new Digit(input.nextInt()); //variable name linking to other class
		
		
		while (true) //while statement so it loops
		{	
		
		System.out.println("Show (W)hole number.");
		System.out.println("Show (O)nes place number.");
		System.out.println("Show (T)ens place number.");
		System.out.println("Show (H)undreds place number.");
		System.out.println("(Q)uit"); //user options
		
		
		
		System.out.println(" "); //space for cleaner code
		System.out.println("Enter your choice"); //prompt user for choice
		
		choice = input.next();
		choice = choice.toLowerCase(); //Make users inputed option in lowercase to avoid errors
		
	
			if (choice.equals("w")) //if choice is " "
			{
				System.out.println(digit.Whole());
			}
			if (choice.equals("h")) //if choice is " "
			{
				System.out.println(digit.Hundreds());
			} 
			if (choice.equals("t")) //if choice is " "
			{
				System.out.println(digit.tens());
			}
			if (choice.equals("o")) //if choice is " "
			{
				System.out.println(digit.ones());
			}
			
			if (choice.equals("q")) //if choice is " "
			{
				break;
			}
		}


	}

}

/* Screen Dump

Paste the output of your code here

TestCase1:

Enter an integer: 345
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
 
Enter your choice
W
345
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
 
Enter your choice
q

TestCase2:

Enter an integer: 34
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
 
Enter your choice
h
0
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
 
Enter your choice
q







*/

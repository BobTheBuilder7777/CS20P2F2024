/*

Program: MySavings.java          Date: November 20th, 2024

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class MySavings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// import for user input
		
		System.out.println("Enter your initial balance in dollars: "); //declare initial balance
		double iBalance = input.nextDouble();
		
		//Piggy bank
		
		piggybank userbank = new piggybank (iBalance);

	}

}

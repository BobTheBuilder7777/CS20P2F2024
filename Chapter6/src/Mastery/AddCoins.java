/*

Program: AddCoins.java          Date: October 30, 2024

Purpose: Create an AddCoins application that prompts the user for the number of pennies, nickels, dimes and quarters, and 
then displays their total dollar amount

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddCoins { 

	
	public static void getDollarAmount(double quarters, double dimes, double nickels, double pennies) { //GetDollarAmount Method
		
		DecimalFormat deca = new DecimalFormat ("#.##"); //Get the correct formating 
		
		quarters *= 0.25; //Math to calculate value of the quarters
		dimes *= 0.10; //Math to calculate value of the dimes
		nickels *= 0.05; //Math to calculate value of the nickels
		pennies *= 0.01; //Math to calculate value of the pennies
		
		double amount = quarters + dimes + nickels + pennies; //Calculate amount total
		
		System.out.print("Your total is $" + deca.format(amount) ); //Display total
		
	}
	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Declaration
		int quarters, dimes, nickels, pennies;
		
		System.out.println("This application will tell you how much money you have!"); //Tell user about program
		
		System.out.println("Enter your total coins:"); //Prompt user for coins
		
		System.out.print("Quarters: ");
		quarters = input.nextInt();
		
		System.out.print("Dimes: ");
		dimes = input.nextInt();
		
		System.out.print("Nickels: ");
		nickels = input.nextInt();
		
		System.out.print("Pennies: ");
		pennies = input.nextInt();
		
		getDollarAmount(quarters, dimes, nickels, pennies); //Go to getDollarAmount Method
		
		

	}

}


/* Screen Dump

Paste the output of your code here

TestCase1:

This application will tell you how much money you have!
Enter your total coins:
Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 8
Your total is $1.08

TestCase2:
This application will tell you how much money you have!
Enter your total coins:
Quarters: 9
Dimes: 78
Nickels: 50
Pennies: 300
Your total is $15.55






*/

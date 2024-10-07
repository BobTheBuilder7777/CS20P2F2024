/*

Program: PrimeNumbers.java          Date: October 7, 2024

Purpose: Create a PrimeNumbers application that tells the user whether the number they entered is a prime number or not.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Preparing for user input
		Scanner input = new Scanner(System.in);
				
		//Declaration for usernumber 
		int user_num;
		
		System.out.print("Enter a number. This program will tell you if it is prime or not!"); //prompt user to enter number
		user_num = input.nextInt(); //store number in variable
		
		
		if (user_num == 1 || user_num == 0 || user_num < 0)
		{
			
		}
	}

}

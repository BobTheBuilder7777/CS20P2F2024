/*

Program: PrimeNumbers.java          Date: October 30, 2024

Purpose: Modify the PrimeNumbers application to include a method name isPrime(), requiring one parameter and returning a boolean value.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void isPrime(int user_num) {
		boolean prime = false;
		System.out.print(user_num);
		
		if (user_num == 1 || user_num == 0) //If the users inputed number is 1, 0 , or a negative number
		{
			 prime = true; 
		
		} 
		
	
		for (int i = 2; i <= user_num / 2; ++i) //Take the numbers between 2 and user number
		{
			if (user_num % i == 0) //if the remainder is 0, than that means the number is not a prime
				
			{
				prime = true;
			
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Preparing for user input
		Scanner input = new Scanner(System.in);
				
		//Declaration 
		int user_num; //user input
		
		System.out.println("Enter a number. This program will tell you if it is prime or not: "); //prompt user to enter number
		user_num = input.nextInt(); //store number in variable
		isPrime(user_num);
		
		
		
		
		
		if (!prime) //if prime is not true
		{
			System.out.print("Your number is prime.");
		}
		else //if prime is true
		{
			System.out.print("Your number isn't prime.");
		}
		
	}

}
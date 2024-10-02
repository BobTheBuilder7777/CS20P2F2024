/*

Program: GuessingGame.java          Last Date of this Revision: October 2, 2024

Purpose: Create the GuessGame application. The GuessingGame is a number guessing game played between the computer and one player.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Preparing for user input
		Scanner input = new Scanner(System.in);
				
		//Create a variable to generate random numbers later
		Random random = new Random();
				
		//Declaration (for numbers)
		int secretNum, guess;
		
		secretNum = random.nextInt(20) + 1; //gets a random number between 1 and 20
		
		System.out.print("Enter a number between 1 and 20: "); //prompt user to enter a number between 1 and 20
		guess = input.nextInt(); //input guess number
		
		System.out.print("Computer Number:" + secretNum);
		System.out.print("Player Number:" + guess);
		
		
		
		
	}

}

/* Screen Dump

Paste the output of your code here
 
 */
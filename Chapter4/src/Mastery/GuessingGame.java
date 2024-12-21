/*

Program: GuessingGame.java          Date: October 2, 2024

Purpose: Create the GuessingGame application. The GuessingGame is a number guessing game played between the computer and one player.

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
		
		System.out.println("Computer Number: " + secretNum); //Display the computer chosen number
		System.out.println("Player Number: " + guess); //Display the users number
		
		if (secretNum == guess) //Check if the user number and computer number are the same
		{
			System.out.println("You won"); //if they are the same, than the user wins
		}
		else //happens only if secretNum != guess
		{
			System.out.println("Better luck next time."); //if they are not the same, the user doesn't win
		}
		
		
	}

}

/* Screen Dump

Paste the output of your code here

TestCase1:
Enter a number between 1 and 20: 10
Computer Number: 11
Player Number: 10
Better luck next time.

TestCase2:
Enter a number between 1 and 20: 10
Computer Number: 10
Player Number: 10
You won



 
 */
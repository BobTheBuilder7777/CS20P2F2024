/*

Program: GuessingGame.java          Date: October 15, 2024

Purpose: Create the GuessingGame application. The GuessingGame is a number guessing game played between the computer and one player. Modify the algorithm to allow for as many guesses as needed.

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
		int secretNum;
		int guess = 0; //Initializes guess so it is usable for while loop
		
		secretNum = random.nextInt(20) + 1; //gets a random number between 1 and 20
		
		
		
		while (guess != secretNum)
		{
			System.out.print("Enter a number between 1 and 20: "); //prompt user to enter a number between 1 and 20
			guess = input.nextInt(); //input guess number
			if (guess != secretNum) //if user guess is NOT same as random number
			{
				System.out.println("Try again"); //Print this
				System.out.println(" "); //Space for clarity, and then loops back to the beginning of while loop
			}
			else //if user guess IS same as random number
			{
				System.out.println("");
				System.out.println("The random number was " + secretNum + ", good job."); //You win
				break; //Breaks out of the loop and game ends
			}
			
		}
		
		
		
		
	}

}

/* Screen Dump

Paste the output of your code here

TestCase1:
Enter a number between 1 and 20: 9
Try again
 
Enter a number between 1 and 20: 7
Try again
 
Enter a number between 1 and 20: 16

The random number was 16, good job.



TestCase2:
Enter a number between 1 and 20: 7

The random number was 7, good job.

 */
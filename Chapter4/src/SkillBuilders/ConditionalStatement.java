/*

Program: ConditionalStatement.java        Date: September 16th, 2024

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package SkillBuilders;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
	

	
		
		//Declaration Area
		String guess;
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Initialize the secretWord
		String secretWord = "Calgary";
		
		//Prompt the user (means display message)
		System.out.println("What is the secret word? ");
		
		//Record user input
		guess = input.next();
		
		//Check if the two variables are same
		if(guess.equalsIgnoreCase(secretWord))
		{
			System.out.println("Correct"); //output correct if TRUE
		}
		else
		{
			System.out.println("Incorrect guess"); //FALSE case
		}
	}

}


/* Screen Dump
 


What is the secret word? 
Crescent Heights
Incorrect guess

What is the secret word? 
Calgary
Correct



*/

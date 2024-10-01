/*

Program: MathTutor.java          Date: October 1st, 2024

Purpose: Create a MathTutor application that displays math problems by randomly generating two numbers, 1 through 10
			and an operator (*,+,-,/), and then prompts the user for an answer.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/



package Mastery;

import java.util.Random;
import java.util.Scanner;


public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Create a variable to generate random numbers later
		Random random = new Random();
		
		//Declaration (for numbers)
		int num1, num2;
		int answerUser, answerC;
		

		
		//Generate random numbers
		num1 = random.nextInt(10) + 1; //gets number between 1 and 10
		num2 = random.nextInt(10) + 1; //gets number between 1 and 10
		
		
		
		//Declaration (for operator)
		int randomoperator = random.nextInt(4) + 1;
		char operator = " ";
		
		switch(randomoperator) {
		case 1: operator = "+"; //If 1 is generated than you + the 2 numbers
		answerC = (num1 + num2);
		break;
		
		
		case 2: operator = "-";
		answerC = (num1 - num2); //If 2 is generated than you - the 2 numbers
		break;
		
		
		case 3: operator = "*";
		answerC = (num1 + num2); //If 3 is generated than you * the 2 numbers
		break;
		
		
		case 4: operator = "/";
		answerC = (num1 + num2); //If 1 is generated than you / the 2 numbers
		break;
		default:
			System.out.print("There was an error.");
			return;
		}
		
		
		//Ask user for answer
		System.out.print("What is" + num1 + " " + operator + " " + num2 + "?");
		
		//User input what they think is the answer.
		answerUser = userInput.nextInt();
		
		
		
		
		
		
		
		
		
		}
		

	
}
	

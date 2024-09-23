package SkillBuilders;

import java.util.Scanner;

public class CubesSum {

	public static void main(String[] args) {
		
		//Declaration
		
		int number;
		int digit = 0;
		int sumofCubes = 0;
		
		//Prep for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt and record user input 
		System.out.println("Enter a postive integer; ");
		number = input.nextInt();
		
		//Calculate sum of digits
		do 
		{ 
			digit = number % 10; //Remainder
			sumofCubes = sumofCubes + digit * digit * digit;
			number = number / 10; //Quotient number
			
		}while(number != 0);
			
		System.out.println("The sum of the cubes of the digits is: "
				+ sumofCubes);

	}

}


/* Screen Dump
 * 
 * Enter a postive integer; 
53
The sum of the cubes of the digits is: 152

 */


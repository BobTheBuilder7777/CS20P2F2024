package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		//Declaration 
		int num, squared;
		double squareRoot;
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt the user (means display message)
		System.out.println("Enter an integer: ");
		
		//Record user input
		num = input.nextInt();
		
		//Take the square root of the num
		squareRoot = Math.sqrt(num);
		
		//Original number to the power of 2
		squared = (int)Math.pow((int)squareRoot, 2);
		
		//Check to see if two numbers are equal
		if(num == squared)
		{
			//System.out statement speaks for itself, no comment needed here
			System.out.println("This is a perfect square.");
		}
		else
		{
			System.out.println("This is not a perfect square.");
		}
	}

}

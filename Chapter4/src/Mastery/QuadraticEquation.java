/*

Program: QuadraticEquation.java          Date: October 3, 2024

Purpose: Create a QuadraticEquation application that gives the solution to any quadratic equation.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Declaration (for a , b , c and discrim, root1, root2
		int a, b, c, discrim, root1, root2;
		
		//prompt user for a, b and c value (used in quadratic equation)
		System.out.println("Enter an int value  for a: "); //a
		a = input.nextInt(); 
		
		System.out.println("Enter an int value  for b: "); //b
		b = input.nextInt(); 
		
		System.out.println("Enter an int value  for c: "); //c
		c = input.nextInt(); 
		
		discrim = (b*b - 4*a*c); //Determine the value of the discri
		System.out.print(discrim);
		
		if (discrim < 0 ) //If discrim < 0, 
		{
			System.out.print("There are no real roots since the discriminant is less than 0."); //No real roots if discrim < 0
		}
		else if (discrim >= 0) //if discrim is greater than or equal to 0
		{
			
		}
		
		
		
		
		
	}

}

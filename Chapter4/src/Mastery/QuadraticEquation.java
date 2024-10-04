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
		
		if (discrim < 0 ) //If discrim < 0, 
		{
			System.out.print("There are no real roots since the discriminant is less than 0."); //No real roots if discrim < 0
		}
		else if (discrim >= 0) //if discrim is greater than or equal to 0
		{
			root1 = (int)((-b + (Math.sqrt(discrim))) / (2 * a)); //calculate root1 (this root will add the -b value to the square rooted discri and than divide by 2 multiplied by a
		
			
			root2 = (int)((-b - (Math.sqrt(discrim))) / (2 * a)); //calculate root2 (this root will subtract the square rooted discrim from the -b value and than divide by 2 multiplied by a
			
			if (root1 == root2) //This if statement compares the value of root1 and root2
			{
				System.out.print("The root of the quadratic equation is " + root1); //if root1 is same as root2, only print 1 root
			}
			else
			{
				System.out.print("The roots of the equation are " + root1 + " and " + root2); //if root1 isn't same as root2, print 2 different roots
			}
		}
		
	
	}

}

/* Screen Dump

Paste the output of your code here

TestCase1:
Enter an int value  for a: 
2
Enter an int value  for b: 
4
Enter an int value  for c: 
-30
The roots of the equation are 3 and -5
 
 
TestCase2:
Enter an int value  for a: 
3
Enter an int value  for b: 
0
Enter an int value  for c: 
0
The root of the quadratic equation is 0


TestCase3:
Enter an int value  for a: 
56
Enter an int value  for b: 
3
Enter an int value  for c: 
29
There are no real roots since the discriminant is less than 0.

 */
	
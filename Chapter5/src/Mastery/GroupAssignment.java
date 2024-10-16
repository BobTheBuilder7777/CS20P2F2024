/*

Program: GroupAssignment.java          Date: October 16, 2024

Purpose: Create a GroupAssignment application that prompts the user for his or her name and then displays a group assignment.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Declaration
		String name, lastName;
	
		
		System.out.print("Enter your first name: "); 
		name = input.next(); //initialize name
		
		System.out.print("Enter your last name: ");
		lastName = input.next(); //initialize lastName
		
		System.out.println(" "); //space for clarity of work
		
		
		char lett = lastName.toLowerCase().charAt(0); //declare and initialize lett var which will take the persons last name, and retrieve the first letter of their name
		
		if (lett == 'a' || lett == 'b' || lett == 'c' || lett == 'd' || lett == 'e' || lett == 'f' 
				|| lett == 'g' || lett == 'h' || lett == 'i' ) //if the first letter of their last time starts with a-i
			System.out.print(name + " " + lastName + " is assigned to Group 1");
		
		else if (lett == 'j' || lett == 'k' || lett == 'l' || lett == 'm' || lett == 'n' || lett == 'o'
				|| lett == 'p' || lett == 'q' || lett == 'r' || lett == 's' ) //if the first letter of their last time starts with j-s
			System.out.print(name + " " + lastName + " is assigned to Group 2"); 
		
		else //if the first letter of their last time starts with t-z
			System.out.print(name + " " + lastName + " is assigned to Group 3");
		

	}

}

/* Screen Dump

Paste the output of your code here

TestCase1:

Enter your first name: Christina
Enter your last name: Briglio
 
Christina Briglio is assigned to Group 1



TestCase2:

Enter your first name: Yeng
Enter your last name: Wong
 
Yeng Wong is assigned to Group 3

 */

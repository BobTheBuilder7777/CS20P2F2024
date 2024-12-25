 /*

Program: Palindrome.java        Date: Dec 24th 2024

Purpose: Create a Palindrome application that prompts the user for a string and then displays a message indicating whether or not the string is a palindrome.
Author: Rishi Bhalla
School: CHHS
Course: Computer Science 20

*/

package Mastery;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //import scanner for user input
		
		String User_input;
		boolean palindrome = true;
		
		System.out.println("Enter a string, this program will tell you if it's a palindrome or not.");
		User_input = input.next().toLowerCase(); //Get user input, in lower case so when its converted into an array, its easier
		
		char[] StringArray = User_input.toCharArray(); //converts the string into an array
		
		for (int i = 0; i < StringArray.length / 2; i++) {
			
			if (StringArray[i] != StringArray[StringArray.length - 1 - i]) { //check if the 1st and last, second and second last, etc letters match, if they don't than palindrome becomes false
				palindrome = false;
			}
			}
		
		if (palindrome == true) { //if the string is a palindrome than display that
			System.out.println("Your string is a palindrome.");
		}
		else { //if the string isn't a palindrome
			System.out.println("Your string isn't a palindrome.");
		}
		
		
		

	}
	
	
	

}

/* Screen Dump

Enter a string, this program will tell you if it's a palindrome or not.
mom
Your string is a palindrome.

Test Case 2:

Enter a string, this program will tell you if it's a palindrome or not.
moms
Your string isn't a palindrome.



 */


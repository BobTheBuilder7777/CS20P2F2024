/*

Program: Digit.java          Date: November 25th, 2024

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays the ones, tens, and hundreds digit of the number.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

public class Digit {
	
	private int number;
	
	public Digit(int digit){ //digit object
		number = digit;
		
	}
	
	public int Whole() { //constructor method to display whole number
		return number;
	}
	
	public int Hundreds() { //constructor method for hundreds place calculation
		return (number / 100) %10;
	}
	
	public int tens() { // constructor method for tens place calculation
		return (number / 10)%10;
	}
	
	public int ones() { // constructor method for ones place calculation
		return number % 10;
	}
	
	
	

}

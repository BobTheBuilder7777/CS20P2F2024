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
	
	public Digit(int digit){
		number = digit;
		
	}
	
	public int Whole() {
		return number;
	}
	
	public int Hundreds() {
		return (number / 100) %10;
	}
	
	public int tens() {
		return (number / 10)%10;
	}
	
	public int ones() {
		return number % 10;
	}
	
	
	

}

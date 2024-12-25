/*Program: EvensAndOdds.java        Date: Dec 23rd 2024

Purpose: Create an EvensAndOdds application that generates 25 random integers between 0 and 99 and then
displays all the evens on one line and all the odds on the next line.

Author: Rishi Bhalla
School: CHHS
Course: Computer Science 20 */

package Mastery;


public class EvensAndOdds {

	public static void main(String[] args) {
		
		int[] numbers = new int[25]; //array storing 25 rando numbers
		
		int min = 0; //setting min
		int max = 99;//setting maximum
		int numRange = max - min +1; //setting the range of the numbers
		
		for (int i = 0; i < 25; i++) { //for loop to generate 25 numbers
			numbers [i] = (int) (Math.random() * numRange); //randomly chosen numbers
		}
	
	

		
		System.out.println("Even Numbers: "); //Displays even numbers
		for (int i = 0; i < 25; i++) {
			if ((numbers[i] % 2 == 0)) { //for loop looks at the values in the array, checks if they have a factor of 2, if they do, than they are even
				System.out.print(numbers[i] + " ");
			}
		}
		
		System.out.println(" ");
		
		System.out.println("Odd Numbers: "); //displays odd numbers
		for (int i = 0; i < 25; i++) {
			if ((numbers[i] % 2 != 0)) { //Checks to see if the values in the array have a remainder when divided by 2, they do than they are odd.
				System.out.print(numbers[i] + " ");
			}


	}
}
	
}

/* Screen Dump

Test Case 1:
Even Numbers: 
84 60 14 68 8 94 24 46 40  
Odd Numbers: 
89 3 15 37 61 63 49 79 3 25 45 99 13 13 33 59

Test Case 2:
Even Numbers: 
84 58 52 54 64 62 48 60 40 70 28 84 54 74 4  
Odd Numbers: 
9 93 65 75 37 99 9 9 19 97 


 */


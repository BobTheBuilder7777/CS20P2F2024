/*

Program: MySavings.java          Date: November 20th, 2024

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to make a selection.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class MySavings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// import for user input
		
		PiggyBank piggy = new PiggyBank(); //Object name (piggy) linking to other class
		
		int user_choice;

		do { //do while loop to excute this 
			
			System.out.println("1. Show total in bank");
			System.out.println("2. Add a penny");
			System.out.println("3. Add a nickel");
			System.out.println("4. Add a dime");
			System.out.println("5. Add a quarter");
			System.out.println("6. Take all money out");
			System.out.println("0. to quit");
			System.out.println("Enter your choice: ");
			System.out.println("");
			
			user_choice = input.nextInt();
			
			switch (user_choice) {
			
			case 1: 
				piggy.showTotal(); //show user total
				break;
				
			case 2: 
				piggy.plusPenny();
				System.out.println("Add a penny.");  //add to bank account
				break;
				
			case 3: 
				piggy.plusNickel(); //add to bank account
				System.out.println("Add a nickel.");
				break;
				
			case 4: 
				piggy.plusDime();
				System.out.println("Add a dime.");  //add to bank account
				break;
				
			case 5: 
				piggy.plusQuarter();
				System.out.println("Add a quarter");  //add to bank account
				break;
				
			case 6: 
				piggy.takeAllMoneyOut(); //make total money = 0
				break;
				
			case 0: 
				System.out.print("Ok, Bye."); //end code
				input.close(); //close the scanner
				break;
				
			default:
				System.out.println("That wasn't an option, try again!"); //make sure user enters valid option
			
			
			}
			
		} while (user_choice != 0); //while loop to make sure user_choice isn't 0, and if it is, the code won't run again
		

		
		
		
		

	}

}


/* Screen Dump

Paste the output of your code here

TestCase1:

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take all money out
0. to quit
Enter your choice: 

1
Your total in the Bank is: $0.00
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take all money out
0. to quit
Enter your choice: 

0
Ok, Bye.

TestCase2:

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take all money out
0. to quit
Enter your choice: 

4
Add a dime.
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take all money out
0. to quit
Enter your choice: 

0
Ok, Bye.





*/
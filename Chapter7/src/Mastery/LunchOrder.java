/*

Program: Food.java          Date: December 1st, 2024

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french fries, and sodas and then displays the total for the order.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/                                                                                                                                                                                                                                                                                                                                       package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// import for user input
		
		DecimalFormat format = new DecimalFormat("#.##"); //proper formating 
		
		
		
		//Setting the parameters
		Food burgers = new Food("burger", 1.85, 9, 33, 1);
		Food fries = new Food("fries", 1.3, 11, 36, 4);
		Food salads = new Food("salads", 2, 1, 11, 5);
		Food sodas = new Food("soda", 0.95, 0, 33, 1);
		
		int burger, salad, Ff, soda; //Used to get amount of each item the user wants
		
		System.out.println("Enter the number of hamburgers you want: ");
		burger = input.nextInt(); //User inputs the amount they want
		System.out.println(burgers.toString()); //Prints out the information about each item
			
		
		System.out.println("Enter the number of salad you want: ");
		salad = input.nextInt(); //User inputs the amount they want
		System.out.println(salads.toString()); //Prints out the information about each item
		
		System.out.println("Enter the number of FF you want: ");
		Ff = input.nextInt(); //User inputs the amount they want
		System.out.println(fries.toString()); //Prints out the information about each item
		
		System.out.println("Enter the number of soda you want: ");
		soda = input.nextInt(); //User inputs the amount they want
		System.out.println(sodas.toString()); //Prints out the information about each item
		
		System.out.println(""); //Space for clean code
		
		System.out.println("Your order comes out to be: $" + format.format(Food.getPrice(Ff, salad, soda, burger))); //Display the price of users order
		
		
		
		

	}

}

/* Screen Dump

Paste the output of your code here

TestCase1:

Enter the number of hamburgers you want: 
4
Each burger has 9g of fat, 33g of carbs, and 1g of fiber.
Enter the number of salad you want: 
5
Each salads has 1g of fat, 11g of carbs, and 5g of fiber.
Enter the number of FF you want: 
6
Each fries has 11g of fat, 36g of carbs, and 4g of fiber.
Enter the number of soda you want: 
8
Each soda has 0g of fat, 33g of carbs, and 1g of fiber.

Your order comes out to be: $37.4

TestCase2:

Enter the number of hamburgers you want: 

1
Each burger has 9g of fat, 33g of carbs, and 1g of fiber.
Enter the number of salad you want: 
0
Each salads has 1g of fat, 11g of carbs, and 5g of fiber.
Enter the number of FF you want: 
2
Each fries has 11g of fat, 36g of carbs, and 4g of fiber.
Enter the number of soda you want: 
3
Each soda has 0g of fat, 33g of carbs, and 1g of fiber.

Your order comes out to be: $10.65



*/

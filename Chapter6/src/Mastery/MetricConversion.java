/*

Program: MetricConversion.java          Date: October 29, 2024

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class MetricConversion {
	
	

	public static void inchesToCenti() {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value you want to convert from.");//prompt user for their value
		int user_input = input.nextInt();
		
		double Converted = user_input * 2.54;
		System.out.print("The value " + user_input + " inches is equal to about " + (int)Converted + " centimeters."); //display value
	
			
	}
	
	
	public static void feetToCenti() {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value you want to convert from.");//prompt user for their value
		int user_input = input.nextInt();
		
		double Converted = user_input * 30;
		System.out.print("The value " + user_input + " feet is equal to about " + (int)Converted + " centimeters."); //display value
		
	}

	public static void yardsToMeters() {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the value you want to convert from. ");//prompt user for their value
		int user_input = input.nextInt();
		
		double Converted = user_input * 0.91;
		System.out.print("The value " + user_input + " yards is equal to about " + (int)Converted + " meters."); //display value
}

	public static void milesToKilometers() {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the value you want to convert from. ");//prompt user for their value
		int user_input = input.nextInt();
		
		double Converted = user_input * 1.6;
		System.out.print("The value " + user_input + " miles is equal to about " + (int)Converted + " kilometers. "); //display value
}

	public static void centiToInches() {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value you want to convert from. ");//prompt user for their value
		int user_input = input.nextInt();
		
		double Converted = user_input / 2.54;
		System.out.print("The value " + user_input + " centimeters is equal to about " + (int)Converted + " inches. "); //display value
}
	
	public static void centiToFeet() {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value you want to convert from. ");//prompt user for their value
		int user_input = input.nextInt();
		
		double Converted = user_input / 30;
		System.out.print("The value " + user_input + " centimeters is equal to about " + (int)Converted + " feet. "); //display value
}
	
	public static void metersToYards() {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value you want to convert from. ");//prompt user for their value
		int user_input = input.nextInt();
		
		double Converted = user_input / 0.91;
		System.out.print("The value " + user_input + " meters is equal to about " + (int)Converted + " yards. "); //display value
}
	
	public static void kiloToMiles() {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value you want to convert from. "); //prompt user for their value
		int user_input = input.nextInt();
		
		double Converted = user_input / 1.6;
		System.out.print("The value " + user_input + " kilometers is equal to about " + (int)Converted + " miles. "); //display value
}




	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int conversion;
		
		
		
		//Ask User which unit they want to convert their number to
		System.out.println("Convert:");
		System.out.println("1. Inches to Centimeter,          5. Centimeters to Inches");
		System.out.println("2. Feet to Centimeter,            6. Centimeters to Feet");
		System.out.println("3. Yards to meters,               7. Meters to Yards");
		System.out.println("4. Miles to Kilometers,           8. Kilometers to Miles");
		
		System.out.println("");
		System.out.println("Enter your choice: ");
		conversion = input.nextInt(); //Enter choice of conversion
		
		if (conversion == 1) //if user entered x value, call x method
		{
			inchesToCenti();
		}
		if (conversion == 2)//if user entered x value, call x method
		{
			feetToCenti();
		}
		if (conversion == 3)//if user entered x value, call x method
		{
			yardsToMeters();
		}
		if (conversion == 4)//if user entered x value, call x method
		{
			milesToKilometers();
		}
		if (conversion == 5)//if user entered x value, call x method
		{
			centiToInches();
		}
		if (conversion == 6)//if user entered x value, call x method
		{
			centiToFeet();
		}
		if (conversion == 7)//if user entered x value, call x method
		{
			metersToYards();
		}
		if (conversion == 8)//if user entered x value, call x method
		{
			kiloToMiles();
		}
		


}
}

/* Screen Dump

Paste the output of your code here

TestCase1:

Convert:
1. Inches to Centimeter,          5. Centimeters to Inches
2. Feet to Centimeter,            6. Centimeters to Feet
3. Yards to meters,               7. Meters to Yards
4. Miles to Kilometers,           8. Kilometers to Miles

Enter your choice: 
3
Enter the value you want to convert from. 200
The value 200 yards is equal to about 182 meters.




TestCase2:

Convert:
1. Inches to Centimeter,          5. Centimeters to Inches
2. Feet to Centimeter,            6. Centimeters to Feet
3. Yards to meters,               7. Meters to Yards
4. Miles to Kilometers,           8. Kilometers to Miles

Enter your choice: 
7
Enter the value you want to convert from. 182
The value 182 meters is equal to about 200 yards. 
 */

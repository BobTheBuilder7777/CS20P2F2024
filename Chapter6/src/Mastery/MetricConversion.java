package Mastery;

import java.util.Scanner;

public class MetricConversion {

	public static void inchesToCenti(int conversion) {
		
	user_numb
			
	}
	
	public static void feetToCenti() {
		
		
	}

	public static void yardsToMeters() {
	
	 
}

	public static void milesToKilometers() {
	
	 
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int user_numb, conversion;
		
		
		//Prompt user to enter number
		System.out.print("Enter a number you would like to convert to a different unit.");
		user_numb = input.nextInt();
		
		//Ask User which unit they want to convert their number to
		System.out.println("Convert:");
		System.out.print("1. Inches to Centimeter,          5. Centimerters to Inches");
		System.out.println("2. Feet to Centimeter,            6. Centimerters to Feet");
		System.out.println("3. Yards to meters,               7. Meters to Yards");
		System.out.println("4. Miles to Kilometers,           8. Kilometers to Miles");
		
		System.out.println("Enter your choice: ");
		conversion = input.nextInt(); //Enter choice of conversion
		
		if (conversion == 1)
		{
			inchesToCenti();
		}
		


}

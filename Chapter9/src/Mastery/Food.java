/*

Program: Food.java          Date: December 1st, 2024

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french fries, and sodas and then displays the total for the order.

Author: Rishi Bhalla 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;


public class Food {

	
	public static double order; //this will be used for the price calculation
	public String itemNa; //item name (burger, fries, salad, or soda's)
	public int fat, fiber, carb; //grams of fat, fiber, and carbs
	
	public Food(String item, double price, int fats, int carbs, int fibers) { //parameters used to go with the variable declared in the main method of LunchOrder()
		
		order = price;
		itemNa = item;
		fat = fats;
		fiber = fibers;
		carb = carbs;
	}
	
	



	public String toString() { // method which formats the information for each food item
		String information;
		information = "Each " + itemNa + " has " + fat + "g of fat, " + carb + "g of carbs, and " + fiber + "g of fiber.";
		return information; //returns 
		
	} //this returns
	
	public static double getPrice(double burger, double FF, double salad, double soda) { //method which contains the calculations for the final price
	
	
		order = burger * 1.85;
		order = order + (salad * 2);
		order = order + (FF * 1.3);
		order = order + (soda * 0.95);
		return order; //returns the order, which is used in the main method to display final price
		
	}







	








	

	
}

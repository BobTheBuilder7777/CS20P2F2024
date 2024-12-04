package Mastery;

import java.text.DecimalFormat;

public class Food {

	
	public static double order;
	public String itemNa;
	public int fat, fiber, carb;
	
	public Food(String item, double price, int fats, int carbs, int fibers) {
		
		order = price;
		itemNa = item;
		fat = fats;
		fiber = fibers;
		carb = carbs;
	}
	
	



	public String toString() {
		String information;
		information = "Each " + itemNa + " has " + fat + "g of fat, " + carb + "g of carbs, and " + fiber + "g of fiber.";
		return information; //returns 
		
	} //this returns
	
	public static double getPrice(double burger, double FF, double salad, double soda) {
	
	
		order = burger * 1.85;
		order = order + (salad * 2);
		order = order + (FF * 1.3);
		order = order + (soda * 0.95);
		return order;
		
	}







	








	

	
}

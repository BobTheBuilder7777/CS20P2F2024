package Mastery;

import java.text.DecimalFormat;

public class Food {

	DecimalFormat format = new DecimalFormat("#.##");
	
	private double hamburgers;
	private double salads;
	private double FF;
	private double sodas;
	private double order;
	
	public Food() {
		hamburgers = 0;
		salads = 0;
		FF = 0;
		sodas = 0;
		order = 0;
	}
	
	public void burgerPrice(double burger) {
		hamburgers = burger * 1.85;
		System.out.println("Each hamburger has 9.0g of fat, 33.0g of carbs, and 1g of fiber.");
		System.out.println("");
	}
	
	public void saladPrice(double salad) {
		salads = salad * 2;
		System.out.println("Each hamburger has 1.0g of fat, 11.0g of carbs, and 5g of fiber.");
		System.out.println("");
		
	}
	public void ffPrice(double Ff) {
		FF = Ff * 1.30;
		System.out.println("Each hamburger has 11.0g of fat, 36.0g of carbs, and 4g of fiber.");
		System.out.println("");
	}
	public void sodaPrice(double Soda) {
		sodas = Soda * 0.95;
		System.out.println("Each hamburger has 0.0g of fat, 38.0g of carbs, and 0g of fiber.");
		System.out.println("");
	}
	
	public void Order() {
		order = sodas + FF + salads + hamburgers;
		System.out.println("");
		System.out.println("Your total comes out to be: $" + format.format(order));
	}

	

	
}

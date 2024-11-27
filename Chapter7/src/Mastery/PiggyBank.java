package Mastery;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PiggyBank {

	private int penny;
	private int dimes;
	private int nickels;
	private int quarters; //declare penny, dimes, nickels, and quarters variable as private
	
	
	public PiggyBank() { //constructor method
		
		penny = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	
	}
	
	public void plusPenny() {
		penny++;
	
	}
	
	public void plusnickel() {
		nickels++;
	
	}
	
	public void plusDime() {
		dimes++;
	
	}
	
	public void plusQuarters() {
		quarters++;
	
	}
	
	public void takeMoneyOut() {
		penny = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	public double gTotal () {
		
		return (penny * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);

	}
	
	public void  showTotal() {
		System.out.printf("Your total in the Bank is: $%.2f\\n", gTotal());
	}
	
	
	
	
	
		
	}
	
}

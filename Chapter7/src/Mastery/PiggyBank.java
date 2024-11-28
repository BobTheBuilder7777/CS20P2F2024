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
	
	public void plusPenny() { //constructor method for penny
		penny++;
	
	}
	
	public void plusNickel() { //constructor method for nickels
		nickels++;
	
	}
	
	public void plusDime() { //constructor method for dimes
		dimes++;
	
	}
	
	public void plusQuarter() { //constructor method for quarters
		quarters++;
	
	}
	
	public void takeAllMoneyOut() { //if user chooses to take out all money, then each variable becomes 0. Leading to a total of 0 in bank account.
		penny = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	public double gTotal () { //constructor method to properly calculate the total amount of money
		
		return (penny * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);

	}
	
	public void  showTotal() {
		System.out.printf("Your total in the Bank is: $%.2f\n", gTotal()); //print total
	}
	
	
	
	
	
		
	}
	


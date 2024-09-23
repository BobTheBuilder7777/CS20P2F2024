package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class ProjectMastery {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		System.out.print("How much time was spent designing the project application? ");
		double designing = userInput.nextInt();		
		
		System.out.print("How much time was spent coding the project application? ");
		double coding = userInput.nextInt();		
		
		System.out.print("How much time was spent debugging the project application? ");
		double debugging = userInput.nextInt();		
		
		System.out.print("How much time was spent testing the project application? ");
		double testing = userInput.nextInt();		
		
		System.out.print(" ");
		
		double total_T = testing + debugging + coding + designing;
		
		double design_P = designing / total_T;
		double coding_P = coding / total_T;
		double debug_P = debugging / total_T;
		double testing_P = testing / total_T;
		
		System.out.println("Task           % Time");
		System.out.println("         " + nf.format(design_P));
		System.out.println("Coding            " + nf.format(coding_P));
		System.out.println("DebDesigningugging         " + nf.format(debug_P));
		System.out.println("Testing           " + nf.format(testing_P));
		
	}

}

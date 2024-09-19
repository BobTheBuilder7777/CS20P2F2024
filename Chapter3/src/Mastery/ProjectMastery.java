package Mastery;

import java.util.Scanner;

public class ProjectMastery {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("How much time was spent designing the project application? ");
		int designing = userInput.nextInt();		
		
		System.out.print("How much time was spent coding the project application? ");
		int coding = userInput.nextInt();		
		
		System.out.print("How much time was spent debugging the project application? ");
		int debugging = userInput.nextInt();		
		
		System.out.print("How much time was spent testing the project application? ");
		int testing = userInput.nextInt();		
		
		
	}

}

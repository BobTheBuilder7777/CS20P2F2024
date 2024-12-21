package SkillBuilders;

import java.util.Scanner;

public class RandomNumb {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);

		
		//Declaration 
		int min, max;
		
		//Prompt and record user input
		System.out.println("Enter a minimum number: ");
		min = userInput.nextInt();
		
		System.out.println("Enter a maximum number: ");
		max = userInput.nextInt();
		
		//Generate random numbers
		System.out.println("Random number: "+ 
		                   (int)((max - min + 1) * Math.random() + min));
		
		
	}

}

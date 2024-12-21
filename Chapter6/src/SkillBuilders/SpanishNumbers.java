package SkillBuilders;

import java.util.Scanner;

public class SpanishNumbers {
	
	public static void SpanishNum( int Num)
	{
		if (Num == 1)
		{
			System.out.print(Num + " - is uno in spanish"); //Display number in spanish
		}
		if (Num == 2)
		{
			System.out.print(Num + " - is dos in spanish"); //Display number in spanish
		}
		if (Num == 3)
		{
			System.out.print(Num + " - is tres in spanish"); //Display number in spanish
		}
		if (Num == 4)
		{
			System.out.print(Num + " - is cuatro in spanish"); //Display number in spanish
		}
		if (Num == 5)
		{
			System.out.print(Num + " - is cinco in spanish"); //Display number in spanish
		}
		if (Num == 6)
		{ 
			System.out.print(Num + " - is seis in spanish"); //Display number in spanish
		}
		if (Num == 7)
		{
			System.out.print(Num + " - is siete in spanish"); //Display number in spanish
		} 
		if (Num == 8)
		{
			System.out.print(Num + " - is ocho in spanish"); //Display number in spanish
		}
		if (Num == 9)
		{
			System.out.print(Num + " - is nueve in spanish"); //Display number in spanish
		}
		if (Num == 10)
		{
			System.out.print(Num + " - is diez in spanish"); //Display number in spanish
		}
	}

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
				
		//Declare variables
		int num;
		
		System.out.print("Enter a number between 1-10, to convert to spanish: "); //Prompt user for input
		num = input.nextInt();
		
		SpanishNum(num); //Call method to convert
		

	}

}

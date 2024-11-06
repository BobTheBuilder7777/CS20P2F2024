package SkillBuilders;


import java.util.Scanner;

public class Exponentiation {
	
	public static void powerOf(int num1, int num2) {
		
		int answer = 1;
		for(int i = 1; i <= num2; i++)
		{
			answer = answer*num1;
		}
		
		System.out.print(num1 + " to the power of " + num2 + " is " + answer);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Enter 2 numbers. The first number will be put to the power of the second number!");
		
		System.out.println("Enter your first number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter your second number: ");
		num2 = input.nextInt();
		
		powerOf(num1, num2);


	}

}

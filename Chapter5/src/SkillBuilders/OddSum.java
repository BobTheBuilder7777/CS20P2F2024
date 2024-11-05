package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int i, user_num, oddnum;
		int sum = 0;
		
		System.out.println("Enter a number: ");
		user_num = input.nextInt();
		
		
		for(i=1; i<=user_num ; i += 2)
		{

			sum += i;
		}

		System.out.print("The sum of the odds is: " + sum);
	}

}

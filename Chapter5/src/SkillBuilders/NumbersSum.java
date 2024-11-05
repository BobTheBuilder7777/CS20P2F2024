package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
		
		int i, user_num, sum;
		
		System.out.println("Enter a number: ");
		user_num = input.nextInt();
		
		
		for(i = 1;i<=user_num;i++)
		{
			System.out.println(i);
		}
		sum = (int)(0.5 * user_num * (user_num+1));
		System.out.println("The sum is: " + sum);

	}

}

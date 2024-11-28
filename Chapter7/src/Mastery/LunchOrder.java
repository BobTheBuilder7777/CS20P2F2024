                                                                                                                                                                                                                                                                                                                                            package Mastery;

import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// import for user input
		
		Food food = new Food();
		int burger, salad, Ff, soda;
		
		System.out.print("Enter the number of hamburgers you want: ");
		burger = input.nextInt();
		food.burgerPrice(burger);
			
		
		System.out.print("Enter the number of salad you want: ");
		salad = input.nextInt();
		food.saladPrice(salad);
		
		System.out.print("Enter the number of FF you want: ");
		Ff = input.nextInt();
		food.ffPrice(Ff);
		
		System.out.print("Enter the number of soda you want: ");
		soda = input.nextInt();
		food.sodaPrice(soda);
		
		food.Order();
		
		
		

	}

}

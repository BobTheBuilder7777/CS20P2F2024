                                                                                                                                                                                                                                                                                                                                            package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// import for user input
		
		DecimalFormat format = new DecimalFormat("#.##"); //proper formating 
		
		
		
		//Setting the perameters
		Food burgers = new Food("burger", 1.85, 9, 33, 1);
		Food fries = new Food("fries", 1.3, 11, 36, 4);
		Food salads = new Food("salads", 2, 1, 11, 5);
		Food sodas = new Food("soda", 0.95, 9, 33, 1);
		
		int burger, salad, Ff, soda;
		
		System.out.println("Enter the number of hamburgers you want: ");
		burger = input.nextInt();
		System.out.println(burgers.toString());
			
		
		System.out.println("Enter the number of salad you want: ");
		salad = input.nextInt();
		System.out.println(salads.toString());
		
		System.out.println("Enter the number of FF you want: ");
		Ff = input.nextInt();
		System.out.println(fries.toString());
		
		System.out.println("Enter the number of soda you want: ");
		soda = input.nextInt();
		System.out.println(sodas.toString());
		
		System.out.println("");
		
		System.out.println("Your order comes out to be: $" + format.format(Food.getPrice(Ff, salad, soda, burger)));
		
		
		
		

	}

}

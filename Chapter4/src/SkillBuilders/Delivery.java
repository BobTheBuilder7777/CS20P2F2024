package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) 

	{	

     //Declarations

     int Height, Width, Length;



     //prepare for userinput

     Scanner userInput = new Scanner(System.in);

     

     //prompt user for values

        System.out.println("Please enter the Length of the box:");

            Length = userInput.nextInt(); //Length value



        System.out.println("Please enter the Width of the box:");

            Width = userInput.nextInt(); //Width value



        System.out.println("Please enter the Height of the box:");

            Height = userInput.nextInt(); //Height value







     if (Length > 10 || Width > 10 || Height > 10){ //Check if any of the dimensions are greater than 10

        System.out.println("Package is Rejected"); //Reject if any of them are greater than 10

     } else {

            System.out.println("Package is Accepted"); //Accept if all variables are less than 10

        }



    }

	

}
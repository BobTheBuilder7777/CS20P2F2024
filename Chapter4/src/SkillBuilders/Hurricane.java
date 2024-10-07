package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			{ 

		    Scanner input = new Scanner(System.in);





		    //Declaration

		    String name;

		    int category;



		    //Prompt user message


		    System.out.println("The windspeed you enter must be a number over 74 MPH, or else it does not fall under any hurricane categories.");

		   

		    //input huricane name

		     System.out.println("Please enter the name of the Hurricane:");

		        name = input.nextLine();


		       System.out.print(""); //Line of space for cleaner code

		    //prompt user for speed

		    System.out.println("Please enter the Hurricane speed (74MPH or above) in MPH:");

		        category = input.nextInt();

		    

		    //if statements to check which category the speeds fit in

		     if (category >= 74 && category <= 95 ){

		        System.out.println("Hurricane " + name + " falls under Category 1 windspeeds: 74-95 MPH, 64-82 KT, 119-153 KM/H");

		        }

		     if (category >= 96 && category <= 110 ){

		        System.out.println("Hurricane " + name + " falls under Category 2 windspeeds: 96-110 MPH, 83-95 KT, 154-177 KM/H");

		     }

		     if (category >= 111 && category <= 130 ){

		        System.out.println("Hurricane " + name + " falls under Category 3 windspeeds: 111-130 MPH, 96-113 KT, 178-209 KM/H");

		     }

		     if (category >= 131 && category <= 155 ){

		        System.out.println("Hurricane " + name + " falls under Category 4 windspeeds: 131-155 MPH, 114-135 KT, 210-249 KM/H");

		     }

		     if (category >= 155){

		        System.out.println("Hurricane " + name + " falls under Category 5 windspeeds: Greater than 155 MPH, 135 KT, 249 KM/H");

		     }

		     //This statement will print if the user enters a speed below 74

		     else if (category < 74){

		          System.out.println("Error, the speed value has to be greater than or equal to 74 MPH");

		        }

		    }

		}
	}


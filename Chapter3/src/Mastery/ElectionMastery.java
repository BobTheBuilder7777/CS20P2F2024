package Mastery;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectionMastery
	{

	public static void main(String[] args)
		{
			
			Scanner userInput = new Scanner(System.in);
			
			DecimalFormat deca = new DecimalFormat ("#.##");
			
			
			System.out.print("How many votes did Awbrey get in New York this election? ");
			int Ambrey_NY = userInput.nextInt();
			
			System.out.print("How many votes did Martinez get in New York this election? ");
			int Martinez_NY = userInput.nextInt();
			
			System.out.println(" ");
			
			System.out.print("How many votes did Awbrey get in New Jersey this election? ");
			int Ambrey_NJ = userInput.nextInt();
			
			System.out.print("How many votes did Awbrey get in New Jersey this election? ");
			int Martinez_NJ = userInput.nextInt();
			
			System.out.println(" ");
			
			System.out.print("How many votes did Awbrey get in Connecticut this election? ");
			int Ambrey_Con = userInput.nextInt();
			
			System.out.print("How many votes did Awbrey get in Connecticut this election? ");
			int Martinez_Con = userInput.nextInt();
			
			
			System.out.println(" ");
			
			System.out.println("Election Results for New York: ");
			System.out.println("Awbrey: " + Ambrey_NY);
			System.out.println("Martinez: " + Martinez_NY);
			System.out.println(" ");
			
			System.out.println("Election Results for New Jersey: ");
			System.out.println("Awbrey: " + Ambrey_NJ);
			System.out.println("Martinez: " + Martinez_NJ);
			System.out.println(" ");
			
			System.out.println("Election Results for New York: ");
			System.out.println("Awbrey: " + Ambrey_Con);
			System.out.println("Martinez: " + Martinez_Con);
			System.out.println(" ");
			
			int Ambrey_T = Ambrey_NY + Ambrey_NJ + Ambrey_Con;
			int Martinez_T = Martinez_NY + Martinez_NJ + Martinez_Con;
			int Total_V = Ambrey_T + Martinez_T;
			
			double Ambrey_Percantage = (double)Ambrey_T / (double)Total_V;
			double Martinez_Percantage = (double)Martinez_T / (double)Total_V;
			
			Martinez_Percantage *= 100;
			Ambrey_Percantage *= 100;
					
			
			System.out.println("Candidate       Votes        Percentage ");
			System.out.println("Awbrey:        " +    Ambrey_T + "           "  + deca.format(Ambrey_Percantage) +  "%");
			System.out.println("Martinez:      " +  Martinez_T + "           "  + deca.format(Martinez_Percantage) + "%");
			System.out.println("TOTAL VOTES:   " + Total_V);
			
			
		}

	}



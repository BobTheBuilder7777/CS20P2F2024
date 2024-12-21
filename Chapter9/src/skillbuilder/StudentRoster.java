package skillbuilder;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numbStud;
		
		System.out.print("Enter the number of students in the class: ");
		numbStud = input.nextInt();
		
		System.out.println("");
		
		String [] students = new String [numbStud];
		
		int namesEntered = 0;
		
		while (namesEntered != numbStud) {
			System.out.print("Enter a student name: ");
			System.out.println("");
			if (namesEntered != numbStud) {
				students[namesEntered] = input.next();
				namesEntered += 1;
			}
		}
		
		 System.out.println("\nStudent Roster");
	        for (String name : students) {
	            System.out.println(name);
	        }
		

	}

}

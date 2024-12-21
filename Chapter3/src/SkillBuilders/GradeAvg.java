package SkillBuilders;

import java.util.*;

public class GradeAvg {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your first grade.  ");
		int grade1 = userInput.nextInt();
		
		System.out.println("Please enter your second grade.  ");
		int grade2 = userInput.nextInt();
		
		System.out.println("Please enter your third grade.  ");
		int grade3 = userInput.nextInt();
		
		System.out.println("Please enter your forth grade.  ");
		int grade4 = userInput.nextInt();
		
		System.out.println("Please enter your fifth grade.  ");
		int grade5 = userInput.nextInt();
		
		int grade_avg = grade1;
		grade_avg += grade2;
		grade_avg += grade3;
		grade_avg += grade4;
		grade_avg += grade5;
		
		grade_avg = grade_avg / 5;
		
		System.out.println("The average of your five grades is " + grade_avg + "%.");
		

	}

}

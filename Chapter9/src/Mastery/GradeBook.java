package Mastery;

import java.util.Scanner;

public class GradeBook {

	Scanner input = new Scanner(System.in); //import scanner for user input
	private int[][] grades; // 2d array storing grades for 12 students and 5 tests
	
	public GradeBook() {
		grades = new int[12][5]; //initialize the amount of values the array will take
	}

	
	public void GetGrades() { //method when called is used to ask user for grades of each student
		
		for (int student = 0; student < grades.length; student++){ //method goes through 12 students, asks for 5 test marks for all 12
			System.out.println("Enter student " + (student +1) + "'s grades:"); //all values get stored in the array
			
		for (int test = 0; test < grades[student].length; test++) {
			System.out.println("Test " + (test + 1) + ": ");
			grades[student][test] = input.nextInt();
			}
			}
			}
	
	
	public void ShowGrades() { //method when called prints the test value for each student
			
		System.out.println("Gradebook:");
		for (int student = 0; student < grades.length; student++) { //until student is not the same as the amount of values inside the grade array, the code will loop till each students test values are printed.
			System.out.println("Student" + (student + 1) + ": ");
			
		for (int test = 0; test < grades[student].length; test++) { //loops until each test value is printed for each student
			System.out.println(grades[student][test] + "");
			}
		System.out.println(""); //space to make the code cleaner each time it loops
			}
	}
			
		
	public double studAVG(int num) { //method calculates the average of the chosen student
		int studindex = num - 1; //gets the index of the student
		
		int sum = 0;
		
		for (int test = 0; test < grades[studindex].length; test++) {
			sum+= grades[studindex][test];
		}
		return (double) sum / grades[studindex].length; //returns the students average
	}
		
	public double testAVG(int testchoice) { //This method when called, calculates the average for one of the chosen tests
		int testindex = testchoice -1; //gets index of the test
			
		int sum = 0;
			
		for (int student = 0; student < grades.length; student++) {
				sum+= grades[student][testindex];
			}
		return (double) sum / grades.length; //returns the average of the test
	}
	

	
			
		}
	




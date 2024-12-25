/*Program:  CourseGrades.java        Date: Dec 23rd 2024

Purpose: Create an CourseGrades application that simulates a grade book for a clas with 12 students that each have 5 test scores.

Author: Rishi Bhalla
School: CHHS
Course: Computer Science 20 */

package Mastery;

import java.util.Scanner;

public class CourseGrades {

	public static void main(String[] args) {
		
		int num; //declare num variable, used later
		int testchoice; //declare testchoice, used later
		Scanner input = new Scanner(System.in); //import scanner to allow for user input
		
		GradeBook studgrades = new GradeBook(); //object "studgrades" is used to call methods from the GradeBook class
		
		studgrades.GetGrades(); //prompts user to enter grades for each student
		studgrades.ShowGrades(); //shows the user, the grades for each student
		
		
		
		System.out.println("Enter a number from the student you want to see the average of (students 1-12): ");
		num = input.nextInt(); // ask user for which students average they want to look at
			
		
		System.out.println("Student " + num + "'s average is " + studgrades.studAVG(num) + "%"); 
		//display average of chosen student
		
		
		
		
		System.out.println("Enter which tests average you would like to see. (1-5):");
		testchoice = input.nextInt(); //ask user for which test's average they want to look at
			
		
		System.out.println("Test " + testchoice + "'s average is " + studgrades.testAVG(testchoice) + "%." );
		//display average of chosen test
		


	}

}

/* SCREEN DUMP:
 * 
 
 Enter student 1's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 2's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 3's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 4's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 5's grades:
Test 1: 

4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 6's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 7's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 8's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 9's grades:
Test 1: 

44
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 10's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 11's grades:
Test 1: 
4
Test 2: 
4
Test 3: 
4
Test 4: 
4
Test 5: 
4
Enter student 12's grades:
Test 1: 
44
Test 2: 
4
Test 3: 
4
Test 4: 
5
Test 5: 
6
Gradebook:
Student1: 
4
4
4
4
4

Student2: 
4
4
4
4
4

Student3: 
4
4
4
4
4

Student4: 
4
4
4
4
4

Student5: 
4
4
4
4
4

Student6: 
4
4
4
4
4

Student7: 
4
4
4
4
4

Student8: 
4
4
4
4
4

Student9: 
44
4
4
4
4

Student10: 
4
4
4
4
4

Student11: 
4
4
4
4
4

Student12: 
44
4
4
5
6

Enter a number from the student you want to see the average of (students 1-12): 
2
Student 2's average is 4.0%
Enter which tests average you would like to see. (1-5):
5
Test 5's average is 4.166666666666667%.
 */


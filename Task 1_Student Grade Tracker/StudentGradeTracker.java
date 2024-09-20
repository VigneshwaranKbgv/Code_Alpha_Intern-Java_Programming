
//Code Alpha Task 1 - StudentGradeTracker//

import java.util.Scanner;

public class StudentGradeTracker {

	public static void main(String[] args) {
		
		//Create Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);
		
		//Get the total number of students input from the user
		System.out.println("Enter the total number of Students : ");
		
		int totalStudent = sc.nextInt();
		
		//create an array of size totalStudent to store students marks
		
		int[] studentsMarks = new int[totalStudent];
		
		int totalMarks = 0;
		int maxMarks = Integer.MIN_VALUE;
		int minMarks = Integer.MAX_VALUE;
		
		//Get individual student marks input from user and store it in the array
		for(int i=0; i<totalStudent; i++) 
		{
			System.out.println("Enter marks obtained by Student " + (i+1) + "(Out of 100):");
			studentsMarks[i] = sc.nextInt();
			
			//check whether marks entered are valid within range
			
			while(studentsMarks[i]<0 || studentsMarks[i]>100)
			{
				System.out.println("Invalid Marks.");
				System.out.println("Please enter valid marks of Student " + i+1 + "(out of 100):");
				studentsMarks[i] = sc.nextInt();
			}
			totalMarks+=studentsMarks[i];
		}
		double averageScore = (double) (totalMarks)/totalStudent;
		
		for(int marks : studentsMarks)
		{
			if(marks>maxMarks) maxMarks = marks;
			if(marks<minMarks) minMarks = marks;
		}
		
		System.out.println("Student's Average Score : " + averageScore);
		
		System.out.println("Maximum Marks obtained by student is : " + maxMarks);
	
		System.out.println("Minimum Marks obtained by student is : " + minMarks);
		
		sc.close();
	}
}

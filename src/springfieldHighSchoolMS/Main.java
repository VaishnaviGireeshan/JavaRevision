package springfieldHighSchoolMS;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!\n");
		// future enhancement
		/*
		 * System.out.println("Please enter your role\n1.Student\n2.Teacher\n3.Admin");
		 * int role=sc.nextInt();
		 */

		// student details
		
		System.out.println("Please enter the student's name:");
		String name = sc.nextLine();
		System.out.println("Please enter the student's age:");
		int age = sc.nextInt();
		System.out.println("Please enter the student's gender:");
		String gender = sc.next();
		System.out.println("Please enter the studentID:");
		int studentID = sc.nextInt();
		System.out.println("Please enter the student's academic percentage:");
		double percentage = sc.nextDouble();

		sc.nextLine();

		// Determine stream
		Student student = new Student(name, age, gender, studentID, percentage);
		String stream = student.determineStream();
		System.out.println("\n-- Stream Allocation Result --");
		System.out.println("\nName: " + student.name + "\nAge: " + student.age + "\nGender: " + student.gender
				+ "\nstudentID: " + student.studentID + "\nAcademic Percentage: " + student.percentage + "%");
		System.out.println("\nAllocated Stream: " + stream);
		System.out.println(student.name + " can enroll in courses like " + stream + ".\n");

		// teacher rating
		System.out.println("Please enter the teacher's name you wish to rate:");
		String teacherName = sc.nextLine();

		

		 int rating;
	        do {
	            System.out.println("Please enter your rating for " + teacherName + " (1-5):");
	            rating = sc.nextInt();
	            if (rating < 1 || rating > 5) {
	                System.out.println("Please enter a valid rating between 1 and 5.");
	            }
	        } while (rating < 1 || rating > 5);

	        Teacher teacher = new Teacher(teacherName, 0, "", 0, 0);
	        teacher.addRating(rating);

	        // Display updated teacher rating
	        System.out.println("\n-- Updated Teacher Rating --");
	        System.out.println("\nTeacher: " + teacherName);
	        System.out.println("New Average Rating: " + teacher.calculateAverageRating());
	    }
}
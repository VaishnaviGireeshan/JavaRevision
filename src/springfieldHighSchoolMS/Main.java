package springfieldHighSchoolMS;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	     
	        System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!\n");

	        //student details
	        System.out.println("Please enter the student's name:");
	        String name = scanner.nextLine();
	        System.out.println("Please enter the student's age:");
	        int age = scanner.nextInt();
	        System.out.println("Please enter the student's gender:");
	        String gender = scanner.next();
	        System.out.println("Please enter the student's academic percentage:");
	        double percentage = scanner.nextDouble();

	        // Determine stream
	        Student student = new Student(name, age, gender, percentage);
	        String stream = student.determineStream();
	        System.out.println("\n-- Stream Allocation Result --");
	        System.out.println("\nName: " + student.personName + "\n Age: " + student.personAge + "\nGender: " + student.personGender + "\nAcademic Percentage: " + student.percentage + "%");
	        System.out.println("Allocated Stream: " + stream);
	        System.out.println(student.personName + " can enroll in courses like " + stream + ".\n");

	        // Create a school object
	        School school = new School("Springfield High School");

	        //teacher rating
	        System.out.println("Please enter the teacher's name you wish to rate:");
	        String teacherName = scanner.next();
	        
	        System.out.println("Please enter your rating for " + teacherName + " (1-5):");
	        int rating = scanner.nextInt();

	        // Rate teacher
	        Teacher teacher = new Teacher(teacherName, 40, "Female", 1001, 50000);
	        student.rateTeacher(teacher, rating);

	        // Display updated teacher rating
	        System.out.println("\n-- Updated Teacher Rating --");
	        System.out.println("\nTeacher: " + teacherName);
	        System.out.println("New Average Rating: " + teacher.calculateAverageRating());
	    }
}

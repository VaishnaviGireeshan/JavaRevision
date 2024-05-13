package springfieldHighSchoolMS;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);

	     
	        System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!\n");

	        //student details
	        System.out.println("Please enter the student's name:");
	        String name = sc.nextLine();
	        System.out.println("Please enter the student's age:");
	        int age = sc.nextInt();
	        System.out.println("Please enter the student's gender:");
	        String gender = sc.next();
	        System.out.println("Please enter the student's academic percentage:");
	        double percentage = sc.nextDouble();

	        sc.nextLine(); 

	        
	        // Determine stream
	        Student student = new Student(name, age, gender, percentage);
	        String stream = student.determineStream();
	        System.out.println("\n-- Stream Allocation Result --");
	        System.out.println("\nName: " + student.name + "\nAge: " + student.age + "\nGender: " + student.gender + "\nAcademic Percentage: " + student.percentage + "%");
	        System.out.println("\nAllocated Stream: " + stream);
	        System.out.println(student.name + " can enroll in courses like " + stream + ".\n");

	  
	       
	   

	        //teacher rating
	        System.out.println("Please enter the teacher's name you wish to rate:");
	        String teacherName = sc.nextLine();
	    
	        System.out.println("Please enter your rating for " + teacherName + " (1-5):");
	        int rating = sc.nextInt();

	        Teacher teacher = new Teacher(teacherName, 0, "", 0, 0);
	    
	        teacher.addRating(rating);
	        // Display updated teacher rating
	        System.out.println("\n-- Updated Teacher Rating --");
	        System.out.println("\nTeacher: " + teacherName);
	        System.out.println("New Average Rating: " + teacher.calculateAverageRating());
	        
	        
	        
	    }
}

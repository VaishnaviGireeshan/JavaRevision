package springfieldHighSchoolMS;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	private int employeeID;
	private double salary;
	private List<String> coursesTaught ;
	private List<Integer> ratings;

	public Teacher(String name, int age, String gender, int employeeID, double salary) {
		super(name, age, gender);
		this.employeeID = employeeID;
		this.salary = salary;
		this.coursesTaught=new ArrayList<>();
		this.ratings = new ArrayList<>();
	}

//	public void addCoursesTaught(String coursesTaught) {
//		
//	}
	public void addRating(int rating) {
		ratings.add(rating);
	}
	public void display() {
		System.out.println();
	}
	public double calculateAverageRating() {
		if (ratings.isEmpty()) {
			
			return 0;
		}
		double sum = 0;
		for (int rating : ratings) {
			sum += rating;
		}
		return sum / ratings.size();
	}

	@Override
	public String describeRole() {
			return "Teacher";
	}

}

package springfieldHighSchoolMS;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	private int employeeID;
	private double salary;
	private List<Integer> ratings;

	public Teacher(String personName, int personAge, String personGender, int employeeID, double salary) {
		super(personName, personAge, personGender);
		this.employeeID = employeeID;
		this.salary = salary;
		this.ratings = new ArrayList<>();
	}

	public void addRating(int rating) {
		ratings.add(rating);
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

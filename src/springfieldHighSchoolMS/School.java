package springfieldHighSchoolMS;

import java.util.ArrayList;
import java.util.List;

public class School {
	  private String name;
	    private List<Teacher> teachers;
	    private List<Student> students;

	    // Constructor
	    public School(String name) {
	        this.name = name;
	        this.teachers = new ArrayList<>();
	        this.students = new ArrayList<>();
	    }

	    // Method to add a teacher
	    public void addTeacher(Teacher teacher) {
	        teachers.add(teacher);
	    }

	    // Method to add a student
	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    // Method to retrieve teacher information
	    public String getTeacherInfo() {
	        StringBuilder info = new StringBuilder();
	        for (Teacher teacher : teachers) {
	            info.append("Teacher: ").append(teacher.personName).append(", Average Rating: ").append(teacher.calculateAverageRating()).append("\n");
	        }
	        return info.toString();
	    }
}

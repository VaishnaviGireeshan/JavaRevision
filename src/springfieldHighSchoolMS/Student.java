package springfieldHighSchoolMS;

public class Student extends Person {
	private int studentID;
    public double percentage;
    
	public Student(String name, int age, String gender,double percentage) {
		super(name, age, gender);
		  this.studentID = studentID;
	        this.percentage = percentage;
	}
	
	 // Method to determine educational stream
    public String determineStream() {
        if (percentage >= 85) {
            return "Non-medical (e.g., Physics, Mathematics)";
        } else if (percentage >= 75) {
            return "Medical (e.g., Biology, Chemistry)";
        } else if (percentage >= 65) {
            return "Commerce (e.g., Economics, Business Studies)";
        } else {
            return "Arts (e.g., History, Literature)";
        }
    }

  
    public void rateTeacher(Teacher teacher, int rating) {
        teacher.addRating(rating);
    }
	
	@Override
	public String describeRole() {
		return "Student";
	}

}

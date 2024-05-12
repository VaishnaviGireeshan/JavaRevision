package springfieldHighSchoolMS;

abstract class Person {
	String personName;
	int personAge;
	String personGender;
	public Person(String personName,int personAge,String personGender) {
		this.personName=personName;
		this.personAge=personAge;
		this.personGender=personGender;
	}
	 public abstract String describeRole();
}

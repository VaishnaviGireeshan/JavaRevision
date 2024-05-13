package springfieldHighSchoolMS;
//Abstract classes cannot be instantiated directly
abstract class Person {
	//instance variables
	String name;
	int age;
	String gender;
	
	public Person(String name,int age,String gender) {//initialize the instance variables
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	 public abstract String describeRole();
}

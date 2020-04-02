package com.yedam.study;

public class Student extends Person { //Person 클레서를 상속받겠다.
	private String school;
		
	public Student() {
	super();
	this.school = school;
}

	public Student(String name, int age, String school) {
//		super.setName(name);
//		super.setAge(age);  //set get을 사용해도 되고, super(name, age)라고 해도  똑같음
		super(name, age);
		this.school = school;
	}


	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name = " + super.getName() + ", age= " + super.getAge() +", school=" + school + "]";
		
	}
	
	
	
}

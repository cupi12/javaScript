package com.yedam.study;
//class Child extends Parent{
//	int age;
//	int getAge() {
//		return age;
//	}//END of getAge
//	
//	@Override
//	String getName() {
//		return super.getName() + ", age: " + this.age;
//	}
//	
//}//END of Child
interface EmpService{
	void getEmployee(int empId);
}
public class Parent {
	String name;
	String getName() {
		return name;
	}//End of getName
}//END of Parent class

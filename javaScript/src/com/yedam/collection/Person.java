package com.yedam.collection;

public class Person implements Comparable<Person> {
	private String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person o) {
		//-1 오름차순, 1 내림차순 ,0 값 그대로 출력 
		return this.name.compareTo(o.name); //name 기준 출력
		
//		if(this.name.compareTo(o.name)>0) {  //age 기준 출력  
//			return 1;
//		}else if(this.age < o.age) { 
//			return -1;
//		}else {
//			return 0;
//		}
	}

}// End Of class

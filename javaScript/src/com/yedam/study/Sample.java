package com.yedam.study;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}	

	public static void main(String[] args) {
		System.out.println("=======전체조회=======");
		//전체조회
		EmpDAO dao = new EmpDAO();
//		List<Student> list2 = dao.getEmpList();
//		for(Student s : list2) {
//			System.out.println(s.toString());
//		} 
		

//		BoardDAO b = new BoardDAO();
//		Board brd = b.getBoardInfo(3);
//		System.out.println(brd);
		
		StudentService service = new StudentServiceImpl();
		Student stud =service.getStudent(100);
		System.out.println(stud);
		
//		service.getStudentList();  //Declaration(정의부분) - interface // Implementation(구현부분) - StudentServiceImpl.java
//		List<Student> list = new ArrayList<>();
//		for(Student s : list) {
//			System.out.println(s.toString());
//		}
		
		
		
		
		
//		int result = sum(3,9);
//		int result1 = minus(9,3); //메서드에 static을 사용하거나 인스턴스를 생성한 후 사용 가능

		Person p1 = new Person();
		p1.setName("Hong"); // Person클레스 Name 필드가 private가 되었을 경우 get&set 을 설정하여 set으로 값을 넣음
		p1.setAge(10);
		String n = p1.getName();
		int a = p1.getAge();
		System.out.println("getName : " + n);
		System.out.println("getAge : " + a);

		// 각각의 field에 set으로 채워 넣는것과 인스턴스 생성과 함게 값을 세팅하는것도 가능 get set으로 설정을 해서 가능한것
		Person p2 = new Person("Hwang", 20);
		System.out.println("p2.getName : " + p2.getName());
		System.out.println("p2.getAge : " + p2.getAge());

		Student s1 = new Student();

		s1.setSchool("yedam");
		s1.setAge(30);
		s1.setName("Ha");
		System.out.println(s1.toString());

		Student s2 = new Student();
		s2.setAge(23);
		s2.setName("Kim");
		s2.setSchool("Keimyung");

		Person[] persons = new Person[5];
		persons[0] = p1;
		persons[1] = s1;
		persons[2] = new Student();
		persons[3] = new Person("lee", 25);
		persons[4] = new Person();
		String searchName = "Ha";
		for (Person p : persons) {
			if (p.getName() != null && p.getName().equals(searchName))
				System.out.println("찾을이름 : " + searchName + "=> 결과 :" + p.toString());
		};
	
//		System.out.println("===List=====");
//		List<Person> list = new ArrayList<>();
//		list.add(p1);
//		list.add(p2);
//		list.add(s1);
//		list.add(s2);
////		list.remove(1);  //index값 1번을 지우겠다.
//		if (list.remove(p2)) {
//			System.out.println("p2가 삭제되었습니다.");
//		}
//		for (Person q : list) {
//			System.out.println(q.toString());
//		}

	}
}

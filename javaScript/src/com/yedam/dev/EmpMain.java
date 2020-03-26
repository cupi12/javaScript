package com.yedam.dev;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		EmpDAO e = new EmpDAO(); //EmpDAO 인스턴스 생성
		List<Employee> elist = e.getEmpList(); //empList
		for(Employee emp : elist) {
			System.out.println(emp);	
		}
		
	}

}

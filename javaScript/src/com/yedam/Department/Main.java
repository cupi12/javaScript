package com.yedam.Department;

import java.util.List;

public class Main {
	 public static void main(String[] args) {
	DepartmentDAO d = new DepartmentDAO();
	List<Department> dlist = d.getDepartmentList();
	for(Department department : dlist) {
		System.out.println(department);
	}
	
//	d.getDepartmentList();
}
}

package com.yedam.study;

import java.util.List;

public interface StudentService {
	public List<Student> getStudentList();
	
	public Student getStudent(int id); 
}

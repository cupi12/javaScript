package com.yedam.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 10, Student.Gender.MALE), //
				new Student("Hwang", 9, Student.Gender.FEMALE), //
				new Student("Choi", 8, Student.Gender.MALE), //
				new Student("Park", 7, Student.Gender.FEMALE));
		List<Student> maleStuent = list.stream()//
				.filter(s -> s.getGender() == Student.Gender.MALE)//
				.collect(Collectors.toList());

		maleStuent.stream().forEach(s -> System.out.println("Male : " + s.getName()));
		//collect(Collectors.toSet()) -> Set<Student>
		Set<Student> femaleSet = list.stream().//
				filter(s -> s.getGender() == Student.Gender.FEMALE)//
				.collect(Collectors.toSet());
		femaleSet.stream().forEach(s -> System.out.println("Female : " + s.getName()));
		
		//collect(Collectors.tocollection()) -> HashSet<Student>
		HashSet<Student> hashSet = list.stream()//
		.filter(s -> s.getScore()>=9)//
		.collect(Collectors.toCollection(() -> new HashSet<Student>())); //HashSet<Student>

	}// end of main
}// end of class

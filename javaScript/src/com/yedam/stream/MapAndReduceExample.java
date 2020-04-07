package com.yedam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("Hong", 90)//
				, new Student("Ha", 87)//
				, new Student("Hwang", 80));
		double avg = list.stream()// 중간처리 개별 값을 뽑아냄
				.mapToInt((Student s) -> { // mapToInt ToIntFunction
					return s.getScore();
				})//
				.average()//
				.getAsDouble();

//		Stream<Student> stream = list.stream();
//		IntStream intStream = stream.mapToInt((Student s)->{
//			return s.getScore();
//		});
//		OptionalDouble odbl = intStream.average();
//		avg = odbl.getAsDouble();
		System.out.println(avg);
	}// end of main

}

package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	static List<Student> list = Arrays.asList(//
			new Student("홍길동", "남자", 90, 85), //
			new Student("김순희", "여자", 90, 84), //
			new Student("김자바", "남자", 95, 97), //
			new Student("박한나", "여자", 92, 54));

	static double avg(Predicate<Student> pred) {// Predicate의 test 메서드를 사용함
		int sum = 0, cnt = 0;
		for (Student student : list) {
			if (pred.test(student)) { // Predicate의 return 타입은 boolean타입임
				sum += student.getEnglishScore();
				cnt++;
			} else {

			}
		}
		return (double) sum / cnt;
	}

	public static void main(String[] args) {
		double result = avg(new Predicate<Student>() {//익명개체

			@Override
			public boolean test(Student t) {
				return t.getSex().equals("남자");

			}
		});
		System.out.println("(익명개체) 남자 평균결과 : " + result);
		
		result = avg(t -> t.getSex().equals("여자")); //람다식
		System.out.println("(람다식) 여자 평균 결과: " + result);
	}// EndOfMain
}// EndOfClass

package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 95), new Student("신용권", 95, 93));

	static void printString(Function<Student, String> function) { // 출력 인스턴스가 파라미터로 온다.
		for (Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static double avg(ToIntFunction<Student> func) {
		double avg;
		int sum = 0;
		for (Student student : list) {
			sum += func.applyAsInt(student);
		}
		avg = (double) sum / list.size();
		return avg;
	}

	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		;
		printString(t -> t.getName());

		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());

		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());

//		double avg = avg(new ToIntFunction<Student>() {
//			@Override
//			public int applyAsInt(Student s) {
//				return s.getEnglishScore();
//			}
//			
//		});
		double avg = avg(s -> s.getEnglishScore()); // 위 주석을 람다 표현식으로 바꾼것
		System.out.println("영어평균 : " + avg);
		// =========================================================//
		avg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				return s.getMathScore();
			}

		});

//		double avg2 = avg(new ToIntFunction<Student>() {  avg(getMathScore) 연습
//			@Override
//			public int applyAsInt(Student value) {
//				return value.getMathScore();
//			}
//		});

		System.out.println("수학 평균 : " + avg);
		// =========================================================//
	}// EndOfMain

}// EndOfClass

class MathIntClass implements ToIntFunction<Student> {
	@Override
	public int applyAsInt(Student value) {
		return value.getMathScore();
	}
}
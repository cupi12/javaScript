package com.yedam.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArr);
		int sum = intStream.filter(n -> n % 2 == 0)// filter()안에 test 메서드를 구현하는 객체가 와야함
				.peek(s -> System.out.println(s))//
				.sum();
		System.out.println("결과값 = " + sum);

		intStream = Arrays.stream(intArr);
		intStream.filter(n -> n % 2 == 0) //
				.forEach(s -> System.out.println(s));
	}
}

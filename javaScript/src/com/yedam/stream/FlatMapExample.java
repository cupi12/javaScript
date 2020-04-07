package com.yedam.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java8 lambda","stream mapping");
		list.stream()// 반환 타입(return type) == Stream<String>
		.flatMap(str -> Arrays.stream(str.split(" "))) 			// 반환 타입(return type) == Stream<String>
		.forEach(s -> System.out.println(s.toString()));		//split를 사용하여 공란을 구분해줌
	}
}

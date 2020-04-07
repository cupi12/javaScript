package com.yedam.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class InteratorStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "김자바");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) { // 반복자를 가져와서 루핑돌림
			System.out.println(iter.next());
		}
		System.out.println("======================");
		// stream사용
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s));
//		stream.forEach(System.out::println); // s->System.out.println(s); 와 같음
	}
}

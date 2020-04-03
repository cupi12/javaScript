package com.yedam.lambda;

import java.util.function.BiConsumer;

//(std, str) -> { // std > getInfo 매서드 호출
//	System.out.println(str + " ");
//	std.getInfo(); // 안녕하세요 이름:?? 나이 : ??
//};  
// >>>>accept(s1,s2) 에 들어가는 메서드

public class ConsumerExample {
	public static void main(String[] args) {
		BiConsumer<Students, String> biCon = (std, str) -> { // std > getInfo 매서드 호출
			System.out.println(str + " ");
			std.getInfo(); // 안녕하세요 이름:?? 나이 : ??
		};
		Students s1 = new Students("Hwang", 20);
		String s2 = "안녕하세요, ";
		biCon.accept(s1, s2);
		printAccept(biCon, s1, s2);
		
		BiConsumer<String,String> biStr = (str1, str2) -> {
			System.out.println(str1 + " " + str2);
		};
		biStr.accept("람다", " 개썩창");
	}// End of main

	static <T, U> void printAccept(BiConsumer<Students, String> biCon, Students std, String str) { 
		//매개값으로 던질수도 있다는걸 보여주기위함
//		biCon = (s1, s2) -> {
//			System.out.println(str + " ");
//			std.getInfo();
//		};
		biCon.accept(std, str);
	}

}// End of ConsumerExample Class

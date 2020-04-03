package com.yedam.lambda;

@FunctionalInterface
interface MyInterface1 { // Functionalinterface 에서는 메서드 1개만 가능
	void get(String str);

	void get();
}

@FunctionalInterface
interface MyInterface2 { // Functionalinterface 에서는 메서드 1개만 가능
	String get(String str);
}

class MyInterClass implements MyInterface1 {

	public void get() {
		System.out.println("Hello");
	}

	@Override
	public void get(String str) {
		// TODO Auto-generated method stub

	}

}

class Students {
	String name;
	int age;

	Students(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void getInfo() {
		System.out.println("Name : " + name + ", Age : " + age);
	}
}

interface Consumer<T> {
	void get(T t);
}

//class ConsumerClass<T> implements Consumer<T> {
//
//	@Override
//	public void get(T t) {
//		System.out.println("Hello World " + t);
//	}
//}

public class BasicExample2 { // 클레스 선언 //인터페이스명 변수명 = new 구현클레스()
	public static void main(String[] args) {
		MyInterface1 mi = new MyInterClass() {
		};
		mi.get();
		System.out.println();

		Consumer<String> con = (String s) -> {
			System.out.println(s + " Junwon");
		};
		con.get("hello");

//	MyInterface2 mi2 = new MyInterface2() {
//		public String et(String str, String str1) {
//			return str.concat(str1);
//		}
//	}
		
	}// End of Main
}// End of BasicExample2 Class

//	public class BasicExample2 {// 익명객체 생성자 뒤에 생성
//		public static void main(String[] args) {
//			MyInterface1 mi = new MyInterClass() {
//				@Override
//				public void get() {
//					System.out.println("Hello");
//				}
//
//			};
//			mi.get();
//		}
//	}
//
//	public class BasicExample2 {//람다식  인스턴스 정의식 new부터 시작
//		public static void main(String[] args) {
//			MyInterface1 mi = (String a) -> {
//					System.out.println("Hello" + a);
//			};
//			mi.get();
//		}
//	}

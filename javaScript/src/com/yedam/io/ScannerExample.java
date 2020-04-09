package com.yedam.io;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = scn.nextLine();
		System.out.println("나이 입력 : ");
		int age = scn.nextInt();
		System.out.println("키 입력 : ");
		double height = scn.nextDouble();
		
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + height);
		scn.close();
	}
}

package com.yedam.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Address {
	String name;
	String age;
	String phone;

	public Address(String name, String age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

}// end of address

public class CellPhone {
	static String fileName = "javaScript/src/com/yedam/io/phoneList.txt";

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		String name, age, phone;

		System.out.println("1 : 입력    2 : 조회 ");
		int num = scn.nextInt();
		scn.nextLine();
		while (true) {

			if (num == 1) {

				System.out.println("이름 입력>");
				name = scn.nextLine();

				System.out.println("나이 입력>");
				age = scn.nextLine();

				System.out.println("핸드폰번호 입력");
				phone = scn.nextLine();
				scn.nextLine();

				System.out.println("입력 완료");
				Address addr = new Address(name, age, phone);

				FileWriter fw;
				try {
					fw = new FileWriter(fileName, true);
					fw.write(addr.name + ", " + addr.age + ", " + addr.phone + "\n");
					fw.flush();
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			} // end of if
			else if (num == 2) {
				FileReader fr = new FileReader("javaScript/src/com/yedam/io/phoneList.txt"); //읽어옴
				System.out.println("조회 완료!");
			} else {
				System.out.println("숫자를 잘못입력하셨습니다. 프로그램 종료");
				break;
			}

		} // end of while

//		FileOutputStream fos = new FileOutputStream(fileName);
//		for (Address adr : list) {
//			fos.write(adr.getBytes());
//		}

	}// end of main
}// end of CellPhone

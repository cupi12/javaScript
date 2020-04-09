package com.yedam.io;

import java.io.IOException;
import java.io.PrintStream;

public class SystemOutExample집에서보기 {
	public static void main(String[] args) throws IOException {
		PrintStream ps = System.out;  //console로 출력.
		String text = "한글은 달리 처리해야합니다.";
		byte[] cbuf = text.getBytes();  //getBytes : 읽은만큼의 크기를 배열에 할당함.
		ps.write(cbuf); //매개값으로 배열이 들어온 값 출력
		ps.flush(); // flush = ps에 있는 모든 값들을 내보냄
	}
}

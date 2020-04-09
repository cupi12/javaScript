package com.yedam.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) throws IOException {
		List<String> list = Arrays.asList("홍길동","김유신","하준원","홍성우");
		
		FileOutputStream fos = new FileOutputStream("src/com/yedam/io/name.txt");
		int readByte;
		for(String a : list) {
			fos.write(a.getBytes());
		}
		fos.flush();
		fos.close();
//		while((readByte = fos. ) != -1) {
//			fos.write(readByte);
//			System.out.println((char) readByte);
//		}
	}
}

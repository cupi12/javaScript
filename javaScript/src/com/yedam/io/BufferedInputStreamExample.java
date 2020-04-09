package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/com/yedam/io/test.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
//		int readByte = bis.read(); //받는 값은 ascii코드의 숫자값이기때문에 int로 써줌
		FileOutputStream fos = new FileOutputStream("src/com/yedam/io/test.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int readByte;
		while((readByte = bis.read())!= -1) {
			bos.write(readByte);			
		}
		bos.flush();bos.close();fos.close();
		bis.close();fis.close();
		System.out.println("end");
	}
}

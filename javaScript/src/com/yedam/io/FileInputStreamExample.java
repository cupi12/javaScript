package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {

		String path = "src/com/yedam/io/input.txt"; // 읽기용
		FileInputStream fis = new FileInputStream(path);
		String outPath = "src/com/yedam/io/output.txt";
		FileOutputStream fos = new FileOutputStream(outPath);
		int readByte;
//		= fis.read(); // read : 한 바이트를 읽어냄. 더이상 읽을것이 없으면 -1을 출력함.
//		while ((readByte = fis.read()) != -1 ) 
//		{
//			System.out.print((char) readByte);
//		}
//		fis.close();

		while ((readByte = fis.read()) != -1) {
			fos.write(readByte);
			System.out.print((char) readByte);
		}
		fos.flush();
		fos.flush();
		fis.close();

	}// end of main
}

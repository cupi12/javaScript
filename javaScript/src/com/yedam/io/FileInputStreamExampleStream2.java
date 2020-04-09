package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExampleStream2 {
	public static void main(String[] args) throws IOException {

		String path = "src/com/yedam/io/test.gif";
		FileInputStream fis = new FileInputStream(path);

		int readByte;
		long start = System.nanoTime();
		while ((readByte = fis.read()) != -1) {

		}
		fis.close();
		long end = System.nanoTime();
		System.out.println((end - start) + " ns");
		System.out.println("1번 작업 끝");

		FileInputStream fis2 = new FileInputStream(path);
		byte[] buf = new byte[100];
		start = System.nanoTime();
		while ((readByte = fis2.read(buf)) != -1) {
		}
		fis2.close();
		end = System.nanoTime();
		System.out.println((end - start) + " ns");
		System.out.println("2번 작업 끝");
	}
}

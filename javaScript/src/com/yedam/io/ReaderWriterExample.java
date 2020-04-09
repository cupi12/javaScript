package com.yedam.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWriterExample {
	public static void main(String[] args) throws IOException {
		File fileReader = new File("src/com/yedam/io/ScannerExample.java");
		FileReader fr = new FileReader(fileReader);
		int readChar = fr.read();
		while ((readChar = fr.read()) != -1) {
			System.out.print((char) readChar);
		}
		fr.close();
	}
}

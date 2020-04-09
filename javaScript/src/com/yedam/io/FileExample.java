package com.yedam.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;

public class FileExample {
	public static void main(String[] args) throws URISyntaxException, IOException {
		File dir = new File("c:/Temp/Dir");
		File file1 = new File("c:/Temp/file1.txt");
		File file2 = new File("c:/Temp/file2.txt");
		File file3 = new File(new URI("file:///c:/Temp/file3.txt"));

		if (dir.exists() == false) // temp 밑에 dir이 없으면 dir을 만드시요.
			dir.mkdirs(); // dirs 하면 최종 경로까지 다 만들어줌.

		if (file1.exists() == false) // file1이 없으면, 만드시오.
			file1.createNewFile();

		if (file2.exists() == false)
			file2.createNewFile();

		if (file3.exists() == false)
			file3.createNewFile();

		File temp = new File("c:/temp");
		File[] files = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD   a   HH:mm");
		for (File file : files) {
			System.out.print(sdf.format(file.lastModified())); //lastModified < 
			if (file.isDirectory())
				System.out.print("\t<Dir>\t\t" + file.length() + "\t" + file.getName());
			else
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			System.out.println();
		}
	}
}

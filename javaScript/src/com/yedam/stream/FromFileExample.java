package com.yedam.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileExample {
	public static void main(String[] args) throws IOException { //예외처리
		Path path = Paths.get("src/com/yedam/stream/list.txt"); //경로 설정
		Stream<String> strStream = Files.lines(path, Charset.defaultCharset()); // Files.lines 파일내용 읽어옴
		strStream.forEach(s -> System.out.println(s)); //출력
	}
}

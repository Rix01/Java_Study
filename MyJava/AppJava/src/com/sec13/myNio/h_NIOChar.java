package com.sec13.myNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class h_NIOChar {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("b.txt");
		
		// 문자열 쓰기
		List<String> lines = List.of("public", "static", "void main");
		Files.write(path, lines);
		System.out.println("저장 완료");
		
		// 문자열 읽기
		List<String> lines02 = Files.readAllLines(path);
		lines02.forEach(System.out::println);

	}

}

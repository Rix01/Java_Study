package com.sec12.mstream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FlatMapTest {
	
	public static void testFlatMap() {
		Path path = Paths.get("C:\\Users\\Rin\\Desktop\\Study\\LikeLion\\MyJava\\AppJava\\src\\com\\sec12\\mstream\\a.txt");
		try(Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)){
			// 파일의 각 한 줄을 공백 기준으로 단어를 분철해서 리턴
			// Stream<Stream<T>> -> 하나의 단일 스트림으로 Flatten 할 때 사용한다.
			Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
			
			// 결과 출력
			words.forEach(System.out::println);
		} catch(IOException e) {
			System.out.println("파일이 없어 "+e.getMessage());
		}
	}

	public static void main(String[] args) {
//		Path path = Paths.get("a.txt");
		Path path = Paths.get("C:\\Users\\Rin\\Desktop\\Study\\LikeLion\\MyJava\\AppJava\\src\\com\\sec12\\mstream\\a.txt");
		try(Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)){
			// 파일의 각 한 줄을 공백 기준으로 단어를 분철해서 리턴
			// Stream<Stream<T>> -> 하나의 단일 스트림으로 Flatten 할 때 사용한다.
			Stream<Stream<String>> words = lines.map(line -> Stream.of(line.split(" +")));
			
			// 결과 출력	// 중첩 스트림을 처리
			words.forEach(innerString -> innerString.forEach(System.out::println));
		} catch(IOException e) {
			System.out.println("파일이 없어 "+e.getMessage());
		}
		
	}

}

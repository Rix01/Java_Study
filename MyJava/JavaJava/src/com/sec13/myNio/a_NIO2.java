package com.sec13.myNio;
import java.nio.file.*;

public class a_NIO2 {

	public static void main(String[] args) throws Exception{
		// Q1. D: Test 폴더 생성하자.
		Path test = Paths.get("C:\\Users\\Rin\\Desktop\\Study\\LikeLion\\MyJava\\AppJava\\test");
		Files.createDirectories(test);
		
		// Q2. test\\AA 폴더 생성
		Path aadir = test.resolve("AA");
		Files.createDirectories(aadir);
		
		// Q3. test\\BB 폴더 생성
		Path bbdir = test.resolve("BB");
		Files.createDirectories(bbdir);
		
		// Q4. test\\BB\\a.txt 생성
		Path atxt = test.resolve("a.txt");
		Files.createFile(atxt);
		
		// Q5. a.txt 삭제
		if (Files.exists(atxt)) {
		    Files.delete(atxt);
		    System.out.println("파일 삭제 완료");
		} else {
		    System.out.println("파일이 존재하지 않습니다.");
		}

	}

}

package com.sec13.myNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class g_NIOByte {
	// -byte 단위 : Files.newOutputStream() Files.newInputStream()
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("a.txt");

		// byte A~Z까지 입출력하자. var==지역변수 선언(var은 jdk 10버전부터), 컴파일시 타입이 결정남. 람다식에는 사용할 수 없음.
		try(var out = Files.newOutputStream(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)){
			for(byte i = 'A'; i<='Z'; i++) {
				out.write(i);
			}
		}
		System.out.println("저장 완료!!!");
		
		try(var in = Files.newInputStream(path)){
			int data = 0;
			while((data=in.read())!=-1) {
				System.out.print((char)data);
			}
		}
	}
}

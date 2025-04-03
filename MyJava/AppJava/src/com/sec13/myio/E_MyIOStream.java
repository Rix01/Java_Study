package com.sec13.myio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// byte 단위로 읽고 쓰자.
public class E_MyIOStream {

	public static void main(String[] args) {
		String fileName = "./d.txt"; // File filename = new File("./d.txt");
		// 같은 패키지에 넣기 위함
//		File fileName = new File("/AppJava/src/com/sec13/myio/d.txt");
//		System.out.println(fileName.getPath());
//		System.out.println(fileName.getAbsolutePath());
		try {
			MyWrite(fileName);
			MyReader(fileName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void MyWrite(String fileName) throws IOException {
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(fileName));
		for (byte i = 'A'; i <= 'Z'; i++) {
			bo.write(i);	// IOException
		}
		bo.close();
		System.out.println("파일에 A ~ Z까지 저장했어!!");
	}
	
	// 버퍼 추가
	private static void MyReader(String fileName) throws IOException {
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName));
		int data = 0;
		System.out.println("파일에서 읽은 데이터");
		// fi.read()를 data에 대입. data값이 -1이면 비어있는 것.
		while((data=bi.read())!=-1) {
			System.out.print((char)data + " ");
		}
		bi.close();
	}

}

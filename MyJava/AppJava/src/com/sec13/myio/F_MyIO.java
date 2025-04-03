package com.sec13.myio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

// byte 단위로 읽고 쓰자.
public class F_MyIO {

	public static void main(String[] args) {
		String fileName = "./f.txt"; // File filename = new File("./d.txt");
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
		FileWriter fw = new FileWriter(fileName);
		for (char i = 'A'; i <= 'Z'; i++) {
			fw.write(i);	// IOException
		}
		fw.close();
		System.out.println("파일에 A ~ Z까지 저장했어!!");
	}

	private static void MyReader(String fileName) throws IOException {
		FileReader fi = new FileReader(fileName);
		int data = 0;
		System.out.println("파일에서 읽은 데이터");
		// fi.read()를 data에 대입. data값이 -1이면 비어있는 것.
		while((data=fi.read())!=-1) {
			System.out.print((char)data + " ");
		}
		fi.close();
	}

}

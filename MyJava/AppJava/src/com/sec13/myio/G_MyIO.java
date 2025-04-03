package com.sec13.myio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// char 단위를 BufferedReader, BufferedWriter로 읽고 쓰자.
public class G_MyIO {

	public static void main(String[] args) {
		String fileName = "./g.txt"; // File filename = new File("./d.txt");
		// 같은 패키지에 넣기 위함
//		File fileName = new File("/AppJava/src/com/sec13/myio/d.txt");
//		System.out.println(fileName.getPath());
//		System.out.println(fileName.getAbsolutePath());
		try {
//			MyWrite(fileName);
//			MyReader(fileName);
			MyReader02(fileName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void MyReader02(String fileName) throws IOException {
		// 라인 단위로 읽겠다. = String
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String data = null;
		System.out.println("파일에서 읽은 데이터");
		// fi.read()를 data에 대입. data값이 -1이면 비어있는 것.
		while((data=br.readLine())!=null) {	// 0 ~ 65535 코드 값으로 data에 대입하자. -1이 될 때까지
			System.out.println(data);
		}
		br.close();
	}

	private static void MyWrite(String fileName) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		for (char i = 'A'; i <= 'Z'; i++) {
			bw.write(i);	// IOException
		}
		bw.close();
		System.out.println("파일에 A ~ Z까지 저장했어!!");
	}
	
	// 버퍼 추가
	private static void MyReader(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		int data = 0;
		System.out.println("파일에서 읽은 데이터");
		// fi.read()를 data에 대입. data값이 -1이면 비어있는 것.
		while((data=br.read())!=-1) {	// 0 ~ 65535 코드 값으로 data에 대입하자. -1이 될 때까지
			System.out.print((char)data + " ");
		}
		br.close();
	}

}

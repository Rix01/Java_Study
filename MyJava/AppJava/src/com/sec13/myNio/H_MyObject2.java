package com.sec13.myNio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Object 단위로 읽고 쓰자.	Student.class를 읽고 쓰겠다.
public class H_MyObject2 {

	public static void main(String[] args) {
		String fileName = "./h.txt"; // File filename = new File("./d.txt");
		// 같은 패키지에 넣기 위함
//		File fileName = new File("/AppJava/src/com/sec13/myio/d.txt");
//		System.out.println(fileName.getPath());
//		System.out.println(fileName.getAbsolutePath());
		try {
			MyWrite(fileName);
			Student.age = 100;
			MyReader(fileName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void MyWrite(String fileName) throws IOException {
		Path path = Paths.get(fileName);
		
		ObjectOutputStream bo = new ObjectOutputStream(Files.newOutputStream(path, StandardOpenOption.CREATE));
		bo.writeObject(new Student("111", 1, 1, 1));
		bo.writeObject(new Student("222", 2, 2, 2));
		bo.writeObject(new Student("333", 3, 3, 3));
		bo.close();
		System.out.println("파일에 객체 저장했어!!");
	}
	
	// 버퍼 추가
	private static void MyReader(String fileName) throws IOException, ClassNotFoundException {
		Path path = Paths.get(fileName);
		ObjectInputStream bi = new ObjectInputStream(Files.newInputStream(path));
		System.out.println("파일에서 읽은 데이터");
		System.out.println(bi.readObject());
		System.out.println(bi.readObject());
		System.out.println(bi.readObject());
		bi.close();
	}

}

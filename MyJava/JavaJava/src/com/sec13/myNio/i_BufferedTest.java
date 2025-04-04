package com.sec13.myNio;

import java.nio.ByteBuffer;

public class i_BufferedTest {
	public static void main(String[] args) {
		System.out.println("====ByteBuffer 확인====");
		ByteBuffer byteBuffer = ByteBuffer.allocate(10);
		
		byteBuffer.put((byte)'A');
		byteBuffer.put((byte)'B');
		byteBuffer.put((byte)'C');
		
		System.out.println("데이터 저장 후 : " + byteBuffer.position());
		
		System.out.println("읽기");
		byteBuffer.flip();	// 읽기 전환
		System.out.println("flip 이후 : " + byteBuffer.position());
//		System.out.println("데이터 저장 후 : " + (char)byteBuffer.get(0));
//		System.out.println("데이터 저장 후 : " + (char)byteBuffer.get(1));
//		System.out.println("데이터 저장 후 : " + (char)byteBuffer.get(2));
		while(byteBuffer.hasRemaining()){
			System.out.println((char)byteBuffer.get());
		}
	}
}

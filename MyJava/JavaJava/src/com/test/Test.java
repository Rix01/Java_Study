package com.test;

// static 메소드는 선언과 동시에 bind가 되고 호출 시 클래스명.메소드명으로 호출한다.
public class Test {
	public static void main(String[] args) {
		System.out.println(100);
		hello();
	}
	
	// 기능 추가 메소드
	public static void hello() {
		System.out.println("안녕하세요!!");
	}
}

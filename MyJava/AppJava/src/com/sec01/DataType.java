package com.sec01;

public class DataType {
	// 전역 변수 영역 == 멤버 필드 영역
	
	public static void prn() {
		// 지역변수 영역
		boolean result = true;	// 1bit result라는 이름의 변수를 선언하고 true값을 대입한다.
		result = false;
		System.out.println("result = " + result);
	}
	public static void main(String[] args) {
		prn();
	}
}

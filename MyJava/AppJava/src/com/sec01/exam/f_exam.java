package com.sec01.exam;

// int a = 100;
public class f_exam {
	
	public static void prn01(long res){
		System.out.println("정수 res = "+res);
	}

	public static void main(String[] args) {
		prn01(10);
		prn01('a');
		prn01((long)90.1);	// double은 명시형변환
	}

}

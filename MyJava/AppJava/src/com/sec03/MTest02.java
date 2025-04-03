package com.sec03;

import java.util.Random;

// API의 생성자를 통해 객체를 생성해보고 메소드를 호출해보자.
public class MTest02 {

	public static void main(String[] args) {
		// Integer i = new Integer(100);
		Integer i = 100;
		System.out.println(i.doubleValue());
		// 알아서 String을 Integer로 바꿔줌.
		Integer i2 = new Integer("100");
		System.out.println(i2.doubleValue());

		String str = "abcdefg"; // String str = new String("abcdefg");
		System.out.println("길이 = " + str.length());
		System.out.println("전체 대문자 = " + str.toUpperCase());
		
		String res = str.toUpperCase();
		System.out.println("출력 : "+res+"  -> 소문자 : "+res.toLowerCase());
	
		// java.util.Random
		java.util.Random r = new java.util.Random();
		System.out.println(r.nextInt(101));
		
		Random r2 = new Random();
		System.out.println(r2.nextInt(101));
		
		int r3 = (int)(Math.random() * 101);
		System.out.println(r3);
	}

}

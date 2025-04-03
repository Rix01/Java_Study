package com.sec02;

public class BitOperator {

	public static void prn() {
		int a = 51;
		int b = 240;

		System.out.println("AND =" + (a & b));
		System.out.println("OR=" + (a | b));
		System.out.println("XOR=" + (a ^ b));
	}

	public static void main(String[] args) {
		// 정수를 2진 문자열로 변경해보자.
		int a = 51;
		int b = 240;

		System.out.println("a의 51을 2진 문자열로 = " + Integer.toBinaryString(a));
		System.out.println("b의 240을 2진 문자열로 = " + Integer.toBinaryString(b));

		// 전체 16자리를 표시하고 싶다. 빈 공간은 0으로 채우자.
		String str = BinaryStringPadding(a);
		System.out.println(str);

		String str2 = BinaryStringPadding(b);
		System.out.println(str2);

		// 실수 타입 구현할 때
		double doubleValue = 3.14159265539;
		long bits = Double.doubleToLongBits(doubleValue);
		String binaryString = Long.toBinaryString(bits);
		System.out.println(doubleValue + "\n" + bits + "\n" + binaryString);
	}

	public static String BinaryStringPadding(int res) {
		String result = String.format("%16s", Integer.toBinaryString(res)).replace(' ', '0');
		return result;
	}
}

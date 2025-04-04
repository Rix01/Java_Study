package com.sec01.exam;
/*
 * 4칙연산을 하고싶다. [직접 출력, 변수 통한 계산, 사용자 자료형 class, 네트워크 처리]
 * 수행 결과를 calc()로 구현해서 메인 메소드에서 호출하자
 */

public class e_exam {

	public static void calc() {
		// 선언 -> 지역변수
		int a, b, hap, sub, mul;
		double div;
		// 값 대입
		a = 100;
		b = 200;
		hap = sub = mul = 0;
		div = 0.0;
		// 연산
		hap = a+b;
		sub = b-a;
		mul = a*b;
		div = b/a;
		// 출력
		System.out.println(a + " + " + b + " = " + hap);
		System.out.println(b + " - " + a + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(b + " / " + a + " = " + div);
	}
	public static void calc02() {
		// 선언 -> 지역변수
		int a, b, hap, sub, mul;
		double div;
		// 값 대입
		a = 100;
		b = 200;
		hap = sub = mul = 0;
		div = 0.0;
		// 연산
		hap = a+b;
		sub = b-a;
		mul = a*b;
		div = b/a;
		// 출력
		System.out.printf("%d + %d = %d\n", a, b, hap);
		System.out.printf("%d - %d = %d\n",b, a, sub);
		System.out.printf("%d * %d = %d\n", a, b, mul);
		System.out.printf("%d / %d = %.1f", b, a, div);
	}
	
	
	public static void main(String[] args) {
		calc();
		calc02();
	}

}

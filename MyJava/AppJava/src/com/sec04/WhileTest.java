package com.sec04;

public class WhileTest {

	public static void countDown() {
		int i = 1;
		System.out.println("Countdown start!");

		while (i <= 5) {
			System.out.printf("%5d", i);
			i++;
		}
	}

	public static void main(String[] args) {
//		countDown();
//		countDown2();
//		test();
		test1();
	}

	private static void countDown2() {
		int i = 1;
		System.out.println("\n\n==========================");

		while (i <= 5) {
			i++;
			System.out.printf("%5d", i);
		}
	}

	/*
	 * 1 ~ 100까지 숫자를 출력해보자. while문으로 작성하자. 
	 * 조건 1 : 짝수만 출력. 
	 * 조건 2 : 짝수의 개수 출력.
	 */
	public static void test() {
		int i = 1;
		int cnt = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				cnt++;
				System.out.printf("%5d\n", i);
			}
			i++;
		}
		System.out.println("짝수의 개수 = " + cnt);
	}
	
	/*
	 * 1 ~ 100까지 숫자를 출력해보자. while문으로 작성하자. 
	 * 조건 1 : 5의 배수에 하트를 주자.
	 * 조건 2 : 5의 배수 단위로 줄바꿈하자.
	 * 조건 3 : 하트 개수 출력
	 */
	public static void test1() {
		int i = 1;
		int cnt = 0;
		while (i <= 100) {
			if (i % 5 == 0) {
				cnt++;
				System.out.printf("%3c\n", '♥');
			} else {
				System.out.printf("%3d", i);
			}
			i++;
		}
		System.out.println(" ♥의 개수 : " + cnt);
	}

}

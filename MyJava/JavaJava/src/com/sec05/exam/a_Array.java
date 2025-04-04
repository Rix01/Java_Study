package com.sec05.exam;

public class a_Array {
	public static void Test() {
		int[] ar = { 10, 20, 30, 40, 50 };
		int ar2[] = { 10, 20, 30, 40, 50 };
		
		System.out.println("반복으로 출력");
		for(int i =0; i<=4; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("제네릭 타입으로 출력");
		for(int res : ar) {
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Test();
	}
}

package com.sec05.exam;

public class d_Array {
	public static void Test() {
		int[] ar = { 10, 20, 30, 40, 50 };
		int ar2[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		prn(ar);
		prn2(ar2);
	}
	
	public static void prn(int[] ar) {
		System.out.println("반복으로 출력");
		for(int i =0; i<=ar.length-1; i++) {
			System.out.println(ar[i]);
		}
	}
	
	private static void prn2(int[] ar) {
		System.out.println("\n제네릭 타입으로 출력");
		for(int res : ar) {
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Test();
	}
}

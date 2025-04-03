package com.sec05.exam;

public class c_Array {
	public static void Test() {
		int[] ar = { 10, 20, 30, 40, 50 };
		int[] ar2 = new int[10];
		
		prn(ar);
		
		for(int i = 0; i<ar2.length; i++) {
			ar2[i] = i + 1;
		}
		
		prn2(ar2);
		
		// 역순 출력
		reversePrn(ar2);
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
	
	private static void reversePrn(int[] ar) {
		System.out.println("\n역순으로 출력");
		for(int i =ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		Test();
	}
}

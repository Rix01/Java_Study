package com.sec05;

import java.util.Arrays;

public class d_ArrayTest02 {
	public static void main(String[] args) {
		int ar[][] = new int[][] { { 10, 20, 30 },
			                       { 40, 50, 60 } };

		System.out.println("ar.lenght=" + ar.length);
		System.out.println("ar[0].lenght=" + ar[0].length);
		System.out.println("ar[1].lenght=" + ar[1].length);

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%5d", ar[i][j]);
			}
			System.out.println();
		}
		
		prn(ar);

	}

	private static void prn(int[][] ar) {
		// 간단한 for
		for (int[] i : ar) {	// 줄 단위
			for (int j : i) {	// 행 단위
				System.out.printf("%5d", j);
			}
			System.out.println();
		}
		
	}

}

package com.test;

public class Doit01 {

	public static void main(String[] args) {
		try {
			// 5초 대기
			Thread.sleep(5000);
			System.out.println("*");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

package com.sec04.exam;
import java.util.Scanner;

public class b_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String addr = sc.nextLine();
		String tel = sc.nextLine();
		System.out.printf("%10s %10s %10s \n", name, addr, tel);
		sc.close();
	}

}

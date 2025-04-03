package work.com.workshop12.string2;

import java.util.Scanner;

public class StringTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		ConvertString moneyStr = new ConvertString();
		System.out.println(moneyStr.convert(money)+"원");
	}

}

package work.com.workshop12.calc;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		int n1, n2;
		String c;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		c = sc.next();
		n2 = sc.nextInt();
		
		Calculator calc = new Calculator();
		switch(c) {
		case "+":
			System.out.println("결과: "+calc.plus(n1, n2)); 
			break;
			
		case "-":
			System.out.println("결과: "+calc.minus(n1, n2)); 
			break;
		case "x":
			System.out.println("결과: "+calc.multiplication(n1, n2)); 
			break;
		case "/":
			System.out.println("결과: "+calc.divide(n1, n2)); 
			break;
		}
		
	}

}

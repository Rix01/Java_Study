package work.com.workshop12.calc;

public class Calculator {
	public double plus(int a, int b) {
		return a + b;
	}

	public double minus(int a, int b) {
		return a - b;
	}

	public double multiplication(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		double result = 0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exception이 발생하였습니다. 다시 입력해 주세요.");
			return 0.0;
		}
		return result;
	}
}

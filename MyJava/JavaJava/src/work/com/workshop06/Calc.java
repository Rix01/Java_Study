package work.com.workshop06;

public class Calc {
	public int calculate(int data) {
		int sum = 0;
		System.out.print("짝수: ");
		for(int i = 2; i<=data; i+=2) {
			System.out.printf("%d ", i);
			sum+= i;
		}
		return sum;
	}
}

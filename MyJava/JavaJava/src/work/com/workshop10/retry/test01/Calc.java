package work.com.workshop10.retry.test01;

import java.util.stream.IntStream;

public class Calc {
	public int calculate(int data) {
		int result = IntStream.rangeClosed(1, 8).filter(n->n%2==0).sum();
		return result;
	}
}

package work.com.workshop07;

public class Calc {
	public double getSum(int data) throws InvalidException{
		int sum =0;
		if(data>5 || data<2) {
			throw new InvalidException();
		}
		
		for(int i =1; i<=data; i++) {
			sum+=i;
		}
		return sum;
	}
}

package work.com.workshop0313;

public class NumberClass {
	@MaxValue(100)
	int number;
	
	public NumberClass(int number) {
		this.number = number;
	}
}

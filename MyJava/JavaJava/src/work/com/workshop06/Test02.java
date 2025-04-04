package work.com.workshop06;

public class Test02 {

	public static void main(String[] args) {
		int eclipse = Integer.parseInt(args[0]);
		Calc calc = new Calc();
		System.out.println("\n결과: "+ calc.calculate(eclipse));
	}

}

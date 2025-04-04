package work.com.workshop04;

public class Test04 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int sum = Calc.calcSum(a,b,c,d);
		
		double avg = sum/4.0;
		System.out.println("Sum:"+sum);
		System.out.printf("avg:%.2f\n",avg);
		
		if(avg>=90) {
			System.out.println("A학점");
		} else if(avg>=70) {
			System.out.println("B학점");
		} else if(avg>=50) {
			System.out.println("C학점");
		} else if(avg>=30) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}
}

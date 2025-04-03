package work.com.workshop07;

import java.util.StringTokenizer;

public class StringTest {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34"; 
		double data []= new double[5];  
		double sum = 0; 
		// StringTokenizer를 이용하여 데이터를 꺼낸다. 
		// https://docs.oracle.com/javase/8/docs/api/index.html
		StringTokenizer st = new StringTokenizer(str, ",");
		
		for(int i =0; i<data.length; i++){
			data[i] = Double.parseDouble(st.nextToken());
		}
		
		for(double d : data){
			sum += d;
		}
		
		// 결과 값을 출력한다.
		System.out.printf("합계 : %.3f\n", sum);
		System.out.printf("평균 : %.3f\n", sum/5.0);
	}
}

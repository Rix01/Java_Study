package work.com.workshop13.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest01 {
	public static void main(String[] args) {
		// argument로 정수를 받는다.
		Scanner sc = new Scanner(System.in);
		int size = 0;
		try {
			size = sc.nextInt();
			if(size<5 || size>10) {
				throw new Exception();
			}
		} catch(Exception e) {
			System.out.println("5~10 중에서 입력하세요.");
			return;
		}
		
		// MakeList 객체 생성
		MakeList ml = new MakeList();
		ml.makeArrayList(size);
		
		ArrayList<Integer> list = ml.getList();
		// for문을 이용하여 ArrayList의 정보 출력하고 평균을 출력 한다.
		for(int i:list) {
			System.out.printf("%d ", i);
		}
		
		// 평균 출력
		System.out.printf("\n평균 : %.1f", ml.getAverage());
	}
}

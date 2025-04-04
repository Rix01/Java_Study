package work.com.workshop13.test06;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;

public class ListHashSet {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		int size = 0;
		try {
			Scanner sc = new Scanner(System.in);
			size = sc.nextInt();
			if(size<10 || size>20) {
				throw new Exception();
			}
		} catch(Exception e) {
			System.out.println("10 ~ 20 사이의 값으로 다시 입력하세요.");
			return;
		}
		
		for(int i = 0; i<size; i++) {
			int randNum = (int)(Math.random()*10+1);	// 1 ~10
			list.add(randNum);
		}
		
		list.stream().forEach(n->System.out.print(n+" "));
		System.out.println();
		
		for(int i:list) {
			set.add(i);
		}
		
		System.out.println(set);
	}
}

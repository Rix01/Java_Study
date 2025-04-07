package work.com.workshop13.test02;

import java.util.ArrayList;

public class MakeList {
	private ArrayList<Integer> al;
	
	public MakeList() {
		// 멤버 변수 초기화
		al = new ArrayList<>();
	}

	// Size 만큼의 정수형 데이터를 랜덤 하게 만들어 ArrayList에 넣는다.
	public void makeArrayList(int size) {
		// 무작위의 번호 발생 후 저장
		// 10부터 19까지의 정수를 랜덤하게 만들어
		for (int i = 0; i < size; i++) {
			al.add((int) (Math.random() * 10 + 10));
		}
	}

	// ArrayList에 셋팅 된 정수들의 평균을 리턴 한다.
	public double getAverage() {
//		double sum = 0;
//		for(int i:al) {
//			sum+=i;
//		}
//		return sum/al.size();
		return al.stream()
				.mapToInt(Integer::intValue)	// int로 변환
				.average()
				.orElse(0.0);	// 값이 없을 때 기본 값
	}

	public ArrayList<Integer> getList() {
		return al;
	}
}

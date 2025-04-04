package work.com.workshop13.test02;

import java.util.ArrayList;

public class MakeList {
	private ArrayList<Integer> al;
	
	public MakeList() {

	}

	// Size 만큼의 정수형 데이터를 랜덤 하게 만들어 ArrayList에 넣는다.
	public void makeArrayList(int size) {
		al = new ArrayList<>(size);
		// 무작위의 번호 발생 후 저장
		// 10부터 19까지의 정수를 랜덤하게 만들어
		for (int i = 0; i < size; i++) {
			al.add((int) (Math.random() * 10 + 10));
		}
	}

	// ArrayList에 셋팅 된 정수들의 평균을 리턴 한다.
	public double getAverage() {
		double sum = 0;
		for(int i:al) {
			sum+=i;
		}
		return sum/al.size();
	}

	public ArrayList<Integer> getList() {
		return al;
	}
}

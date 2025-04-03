package work.com.workshop09.test02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentTest {

	public static void main(String[] args) {
		// Student 객체를 3개 생성하여 배열에 넣는다 List<Student> students로 받는다.
		List<Student> students = new ArrayList<>();
		students.add(new Student("홍길동", 15, 170, 80));
		students.add(new Student("한사람", 13, 180, 70));
		students.add(new Student("이순신", 16, 175, 65));
		
		int totalAge = 0;
		int totalHeight =0;
		int totalWeight = 0;
		// 배열에 있는 객체 정보를 모두 출력 한다 – for문을 이용할 것, studentInfo 함수 사용
		System.out.printf("%-5s %-5s %-5s %-5s\n", "name", "나이", "신장", "몸무게");
		for(Student s:students) {
			System.out.println(s.studentInfo());
			totalAge += s.getAge();
			totalHeight += s.getHeight();
			totalWeight += s.getWeight();
		}
		
		System.out.println("\n");
		
		// Student 객체들의 나이의 평균 출력
		System.out.printf("나이 평균: %.3f\n", totalAge/3.0);
		// Student 객체들의 신장의 평균 출력 
		System.out.printf("신장 평균: %.3f\n", totalHeight/3.0);
		// Student 객체들의 몸무게의 평균 출력 
		System.out.printf("몸무게 평균: %.3f\n", totalWeight/3.0);
		
		// 학생들 중 나이가 가장 적은 학생과 많은 학생 출력
		Optional<Student> oldestStudent = students.stream().max(Comparator.comparingInt(Student::getAge));
		System.out.printf("나이가 가장 많은 학생: %s\n", oldestStudent.get().getName());
		
		Optional<Student> youngestStudent = students.stream().min(Comparator.comparingInt(Student::getAge));
		System.out.printf("나이가 가장 적은 학생: %s\n", youngestStudent.get().getName());
		
		// 학생들 중 신장이 가장 적은 학생과 큰 학생 출력 
		Optional<Student> tallestStudent = students.stream().max(Comparator.comparingInt(Student::getHeight));
		System.out.printf("신장이 가장 큰 학생: %s\n", tallestStudent.get().getName());
		
		Optional<Student> shortestStudent = students.stream().min(Comparator.comparingInt(Student::getHeight));
		System.out.printf("신장이 가장 작은 학생: %s\n", shortestStudent.get().getName());
		
		// 학생들 중 몸무게가 가장 적은 학생과 많이 나가는 학생 출력
		Optional<Student> heaviestStudent = students.stream().max(Comparator.comparingInt(Student::getWeight));
		System.out.printf("몸무게가 가장 많이 나가는 학생: %s\n", heaviestStudent.get().getName());
		
		Optional<Student> lightestStudent = students.stream().min(Comparator.comparingInt(Student::getWeight));
		System.out.printf("몸무게가 가장 적게 나가는 학생: %s\n", lightestStudent.get().getName());

	}

}

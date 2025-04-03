package com.sec11.myutil01;


import java.util.Arrays;
import java.util.Comparator;

// Comparable 인터페이스 구현
public class Person implements Comparable<Person> {	// 제네릭스 타입을 명시 Comparable<T>

   private int id;
   private int age;
   private String name;

   public int getId() {
       return id;
   }
  

   public int getAge() {
       return age;
   }

   public String getName() {
       return name;
   }

   public Person(int id,  int age, String name) {
       this.id = id;     
       this.age = age;
       this.name = name;
   }
   
   // this.id - m_p.id 결과가 양수이면 this
   // 더 크고 음수이면 this가 작다
   @Override
   public int compareTo(Person m_p) {	// Dual-Pivot Quick sort      
       return (this.id - m_p.id);	// 현재 객체 this와 비교 대상 m_p의 id 값을 비교
   }

   @Override

   public String toString() {
       return "[id=" + this.id +  ", age=" + this.age + ", name=" +
               this.name + "]";
   }

   
   public static Comparator<Person> IdComparator = new Comparator<Person>() {
       @Override
       public int compare(Person p1, Person p2) {
           return (p1.getId() - p2.getId());
       }
   };
   
   // 익명 클래스 => 한 번 쓰고 버림
   public static Comparator<Person> AgeComparator = new Comparator<Person>() {	  
       @Override
       public int compare(Person p1, Person p2) {
           return p1.getAge() - p2.getAge();
       }
   };
   // public static Comparator<Person02> AgeComparator = (p1, p2) -> p1.getAge() - p2.getAge();

	public static void main(String[] args) {
		
		Person[] perArr = new Person[3];
		perArr[0] = new Person(111, 25, "루세");
		perArr[1] = new Person(333,  22, "루리");
		perArr[2] = new Person(222,  35, "루오");
		
		System.out.println("정렬 전");
		for(Person res : perArr) {
			System.out.println(res);
		}
		
		System.out.println("\n기본 정렬 후");
		Arrays.sort(perArr);
		for(Person res : perArr) {
			System.out.println(res);
		}
         
   
        Arrays.sort(perArr, Person.AgeComparator);        
        System.out.println("나이순으로 정렬:\n"+Arrays.toString(perArr));
         
   
        Arrays.sort(perArr, Person.IdComparator);
        System.out.println("Id 순으로 정렬:\n"+Arrays.toString(perArr));

	}

}

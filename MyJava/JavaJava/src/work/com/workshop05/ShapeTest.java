package work.com.workshop05;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];

		// (1.조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성 하여
		// 6개의 도형 객체를 배열에 넣는다.
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		// 모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용하여 화면에 출력 한다
		System.out.println("기본 정보");
		for(Shape s:shape) {
			System.out.printf("%-10s %.1f %s\n", s.getClass().getSimpleName(), s.getArea(), s.getColors());
		}
		
		System.out.println("\n사이즈 변경 후 정보");
		// 모든 객체들을 setResize함수를 이용하여 5를 입력 하고 사이즈를 변경 후
		for(Shape s:shape) {
//			switch(s) {
//			case Triangle t-> {
//				((Triangle)s).setResize(5);
//			}
//			case Rectangle r -> {
//				((Rectangle)s).setResize(5);
//			}
//			default ->{
//				System.out.println("잘못된 타입입니다.");
//			}
//			}
			if(s instanceof Resize r) {
				r.setResize(5); // 형변환 후 호출
			}
			System.out.printf("%-10s %.1f %s\n", s.getClass().getSimpleName(), s.getArea(), s.getColors());
		}
		
		// 화면에 출력 한다. 단 for Loop문을 이용한다. 

	}

}

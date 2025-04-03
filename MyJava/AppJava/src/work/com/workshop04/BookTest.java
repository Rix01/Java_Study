package work.com.workshop04;

public class BookTest {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("SQL Plus", 50000, 5.0);
		books[1] = new Book("Java 2.0", 40000, 3.0);
		books[2] = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.printf("%-14s %-5s %3s %10s\n", "책이름", "가격", "할인율", "할인 후 금액");
		System.out.println("------------------------------------------");
		for(Book b: books) {
			System.out.println(b.toString());
		}
	}

}

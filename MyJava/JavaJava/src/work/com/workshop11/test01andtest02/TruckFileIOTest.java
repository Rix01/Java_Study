package work.com.workshop11.test01andtest02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TruckFileIOTest {

	public static void main(String[] args) {
		Truck truck = new Truck(1000, 100, 5); 
		truck.addOil(50); 
		truck.moving(50); 
		truck.addWeight(100); 
		truck.moving(30);
		
		Path path = Path.of("./src/work/com/workshop11/test01andtest02/truck.txt");
		// Truck 상태 파일 저장   Files.writeString()
		try {
			Files.writeString(path, truck.toString());
		} catch(IOException IE) {
			System.out.println(IE.getMessage());
		}
	}

}

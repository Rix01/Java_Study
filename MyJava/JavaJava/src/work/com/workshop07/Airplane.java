package work.com.workshop07;

public class Airplane extends Plane {

	
	public Airplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		int perTen = distance / 10;
		// 10 주행마다 30 감소
		for(int i =0 ; i<perTen; i++) {
			this.setFuelSize(this.getFuelSize()-30);
		}
		
	}
	
}

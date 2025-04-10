package work.com.workshop07.test06;

public class Cargoplane extends Plane{
	
	public Cargoplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		int perTen = distance / 10;
		// 10 주행마다 50 감소
		for(int i =0 ; i<perTen; i++) {
			this.setFuelSize(this.getFuelSize()-50);
		}
		
	}

}

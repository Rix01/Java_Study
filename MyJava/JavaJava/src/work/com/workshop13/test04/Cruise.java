package work.com.workshop13.test04;

public class Cruise extends Ship{
	
	public Cruise() {
		
	}
	
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}


	// 1운행 시 연료 13감소 
	@Override
	public void sail(int dist) {
		this.setFuelTank(this.getFuelTank()-13*dist);
		
	}
	
	// 1 주유 시 연료 8증가 
	@Override
	public void refuel(int fuel) {
		this.setFuelTank(this.getFuelTank()+8*fuel);
		
	}

}

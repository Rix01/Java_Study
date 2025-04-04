package work.com.workshop13.test04;

public class Boat extends Ship{
	
	public Boat() {
		
	}
	
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}


	// 1운행 시 연료 10감소 
	@Override
	public void sail(int dist) {
		this.setFuelTank(this.getFuelTank()-10*dist);
		
	}
	
	// 1 주유 시 연료 10증가
	@Override
	public void refuel(int fuel) {
		this.setFuelTank(this.getFuelTank()+10*fuel);
		
	}
	
	
	
}

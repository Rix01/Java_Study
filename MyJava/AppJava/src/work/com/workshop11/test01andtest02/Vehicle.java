package work.com.workshop11.test01andtest02;

public class Vehicle {
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	public Vehicle() {
		
	}
	
	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		super();
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	
	// 최대적재량과 오일탱크크기를 문자열로 리턴한다.
	@Override
	public String toString() {
		return String.format("%-13d %-13.1f %-13.1f", maxWeight, oilTankSize,
				efficiency);
	}
	
	///////////////////////////////// getter setter
	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public double getFirstEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
	

}

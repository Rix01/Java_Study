package work.com.workshop11.test01andtest02;

public class Truck extends Car {
	public Truck() {

	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 현재 적재 중량 5Kg 당 연비 0.2Km 감소시 킨 값을 리턴한다.
	 */
	public double getEfficiency() {
		double efficiency = 0;
		efficiency = this.getFirstEfficiency()-(this.getCurWeight()/5*0.2);
		return efficiency;
	}

	/*
	 * calcOil( )을 호출하여 오일 감소량을 획득하 고, 잔여오일량에서 감소량을 뺀 새로운 잔 여오일량으로 재설정한다.
	 */
	@Override
	public void moving(int distance) {
		this.setRestOil(this.getRestOil()-calcOil(distance));
	}

	/*
	 * 거리(int)를 연비(double)로 나누어 오일 소모량을 추출 하고 리턴한다
	 */
	private double calcOil(int distance) {
		return (double)distance/getEfficiency();
	}

	/*
	 * calcOil( )을 호출하여 오일 감소량을 획득하 고, 1L 당 3000원의 요금을 산정하여 리턴 한다. 단, 소수점 이하는 버린다.
	 */
	public int getCost(int distance) {
		return (int)calcOil(distance)*3000;
	}

	/*
	 * 부모의 toString()에 연비를 추가하여 리턴 한다.
	 */
	@Override
	public String toString() {
		return String.format("%-13d %-13.1f %-13.1f %-13d %-10.1f", this.getMaxWeight(), this.getOilTankSize(), this.getRestOil(), this.getCurWeight(), getEfficiency());
	}

}

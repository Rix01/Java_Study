package work.com.workshop11.test01andtest02;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;

	public Car() {

	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}

	// 현재 오일량에 추가한다. 단, 오일탱크크기를 넘어서면 안된다.
	public void addOil(int oil) {
		if(restOil+oil<=this.getOilTankSize()) {
			restOil += oil;
		}
	}

	/*
	 * 연비와 주행거리에 따라 오일량을 감소 시킨다.
	 */
	public void moving(int distance) {
		int minusOil = (int) (distance*this.getFirstEfficiency());
		restOil-=minusOil;
	}

	/*
	 * 현재 적재량에 물건을 추가한다. 단, 최대적재중량을 넘어서면 안된다.
	 */
	public void addWeight(int weight) {
		if(this.getMaxWeight()>=this.getCurWeight()+weight) {
			this.setCurWeight(this.getCurWeight()+weight);
		}
	}

	/*
	 * 부모의 toString()에 잔여오일량과 현재적재 중량을 추가하여 리턴한다.
	 */
	@Override
	public String toString() {
		return String.format("%-13d %-13.1f %-13.1f %-13d %-10.1f", this.getMaxWeight(), this.getOilTankSize(), restOil, curWeight, this.getFirstEfficiency());
	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}

}

package work.com.workshop08;

public class L3 extends Car implements Temp {

	public L3() {
		super();
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTempGage() {
		return this.getDistance()/10;
	}

	@Override
	public void go(int distance) {
		this.setDistance(this.getDistance()+distance);
		int perTen = distance / 10;
		// 10 주행마다 주유량 1 감소
		for(int i =0 ; i<perTen; i++) {
			this.setOilSize(this.getOilSize()-1);
			getTempGage();
		}
	}

	@Override
	public void setOil(int oilSize) {
		this.setOilSize(this.getOilSize()+oilSize);
	}
	
}

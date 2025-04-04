package work.com.workshop08;

public class L5 extends Car implements Temp {
	
	public L5() {
		super();
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTempGage() {
		return this.getDistance()/5;
	}

	@Override
	public void go(int distance) {
		this.setDistance(this.getDistance()+distance);
		int perTen = distance / 8;
		int perFive = distance / 5;
		// 8 주행마다 주유량 1 감소
		for(int i =0 ; i<perTen; i++) {
			this.setOilSize(this.getOilSize()-1);
		}
		
		// 5 주행마다 엔진 온도 1 증가
		for(int i =0; i<perFive; i++) {
			getTempGage();
		}
	}

	@Override
	public void setOil(int oilSize) {
		this.setOilSize(this.getOilSize()+oilSize);
	}
	
}

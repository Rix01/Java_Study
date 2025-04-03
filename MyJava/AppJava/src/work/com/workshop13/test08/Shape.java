package work.com.workshop13.test08;

public abstract class Shape {
	protected Point point;
	
	public Shape() {
		
	}

	public Shape(Point point) {
		super();
		this.point = point;
	}
	
	abstract public double getArea();
	
	abstract public double getCircumference();

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
}

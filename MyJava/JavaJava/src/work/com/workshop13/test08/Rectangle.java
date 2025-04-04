package work.com.workshop13.test08;

public class Rectangle extends Shape implements Movable {
	private int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int x, int y) {
		this.width = width;
		this.point = new Point(x, y);
	}

	@Override
	public void move(int x, int y) {
		this.point.setX(this.point.getX()+x+2);
		this.point.setY(this.point.getY()+y+2);
	}
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return width*width;
	}

	@Override
	public double getCircumference() {
		return 4*width;
	}
}

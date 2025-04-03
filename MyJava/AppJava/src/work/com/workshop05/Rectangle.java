package work.com.workshop05;

public class Rectangle extends Shape implements Resize {
	
	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {
		this.setWidth(this.getWidth()+size);
	}

	@Override
	public double getArea() {
		return (double) this.getWidth() * this.getHeight();
	}
	
}

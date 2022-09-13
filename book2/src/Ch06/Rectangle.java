package Ch06;

public class Rectangle extends Shape2 {
	private double width, height;
	public Rectangle (double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width*height;
	}
}

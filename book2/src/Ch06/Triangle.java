package Ch06;

public class Triangle extends Shape2 {
	private double base, height;
	public double getArea() {
		return 0.5*base*height;
	}
	public Triangle (double base, double  height) {
		super();
		this.base = base;
		this.height = height;
	}
}

package Ch06;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : Programming 4번째 문제, P275
 */
class Rectangle2 {
	protected int width, height;
	public Rectangle2 (int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class ColorRectangle extends Rectangle2 {
	String color;
	public ColorRectangle (int width, int height, String color) {
		super(width, height);
		this.color = color;
	}
}

public class _04_ColorRectangleTest {
	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		System.out.println("가로: "+obj.width);
		System.out.println("세로: "+obj.height);
		System.out.println("색상: "+obj.color);
	}
}

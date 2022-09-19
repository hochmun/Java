package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : Programming 1번 문제
 */
interface getInfo {
	public double perimeter();
	public double area();
}

public class P315_01_Circle implements getInfo {
	double radius;
	P315_01_Circle (double radius) {
		this.radius = radius;
	}
	@Override
	public double perimeter() {
		return radius*2*3.141592;
	}
	@Override
	public double area() {
		return radius*radius*3.141592;
	}
}

package Ch06;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : 도형 면적 계산하기, P257
 */
public class ShapeAreaTest {
	public static void main(String[] args) {
		Shape2 obj1 = new Rectangle(10.0, 20.0);
		Shape2 obj2 = new Triangle(10.0, 20.0);
		
		System.out.println("Rectangle: "+obj1.getArea());
		System.out.println("Triangle: "+obj2.getArea());
	}
}

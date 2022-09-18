package Ch07;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : LAB 객체 비교하기
 */
class Rectangle2 implements Comparable {
	public int width = 0;
	public int height = 0;
	
	public String toString() {
		return "Rectangle [width="+width+", height="+height+"]";
	}
	
	public Rectangle2 (int w, int h) {
		width = w;
		height = h;
		System.out.println(this);
	}
	
	public int getArea() {
		return width*height;
	}
	
	@Override
	public int compareTo(Object other) {
		Rectangle2 otherRect = (Rectangle2) other;
		if (this.getArea() < otherRect.getArea()) {
			return -1;
		} else if (this.getArea() > otherRect.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}
	
}

public class P300_RectangleTest {
	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(100, 30);
		Rectangle2 r2 = new Rectangle2(200, 10);
		int result = r1.compareTo(r2);
		if (result == 1) {
			System.out.println(r1 + "가 더 큽니다.");
		} else if (result == 0) {
			System.out.println("같습니다.");
		} else {
			System.out.println(r2 + "가 더 큽니다.");
		}
	}
}

package Ch04;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : Box클래스 정의하고 객체 생성하기, P151
 */
public class Boxtest {
	public static void main(String[] args) {
		Box b;
		b = new Box();
		b.width = 20;
		b.length = 20;
		b.height = 30;
		System.out.println("상자의 가로, 세로, 높이는 "+b.width+
				", "+b.length+", "+b.height+"입니다.");
		System.out.println("상자의 부피는 "+b.getVoume()+"입니다.");
	}
}

class Box {
	//속성
	int width;
	int length;
	int height;
	double getVoume() {
		return (double)width*height*length;
	}
}
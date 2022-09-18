package Ch06;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : programming 1번 문제, P274
 */
class Circle2 {
	protected int radius;
	public Circle2 (int r) {
		this.radius = r;
	}
}

class Pizza extends Circle2 {
	private String name;
	
	public Pizza (String name, int r) {
		super(r);
		this.name = name;
	}
	
	public void print() {
		System.out.println("피자의 종류: "+name+", 피자의 크기: "+radius);
	}
}

public class _01_PizzaTest {
	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}
}

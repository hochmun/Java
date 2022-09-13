package Ch05;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : 정적 변수 사용하기, P201
 */
public class PizzaTest2 {
	public static void main(String[] args) {
		Pizza2 p1 = new Pizza2("Super Supreme");
		Pizza2 p2 = new Pizza2("Cheese");
		Pizza2 p3 = new Pizza2("Pepperoni");
		int n = Pizza2.count;
		System.out.println("지금까지 판매된 피자 개수 = "+n);
	}
}

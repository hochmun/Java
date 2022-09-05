package Ch05;
/*
 * 날짜 : 2022/09/05
 * 이름 : 심규영
 * 내용 : 피자 크기 비교하기, P196
 */
public class PizzaTest {
	public static void main(String[] args) {
		Pizza obj1 = new Pizza(14);
		Pizza obj2 = new Pizza(18);
		
		Pizza largest = obj1.whosLargest(obj1, obj2);
		System.out.println(largest.radius + "인치 피자가 더 큼.");
	}
}

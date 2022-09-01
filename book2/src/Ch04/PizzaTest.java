package Ch04;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : PizzaTest, P156
 */
public class PizzaTest {
	public static void main(String[] args) {
		Pizza obj1 = new Pizza();
		System.out.println("("+obj1.type+" , "+obj1.size+",)");
		
		Pizza obj2 = new Pizza(24, "포테이토");
		System.out.println("("+obj2.type+" , "+obj2.size+",)");
	}
}

class Pizza {
	int size;
	String type;
	
	public Pizza() {
		size = 12;
		type = "슈퍼슈프림";
	}
	
	public Pizza(int s, String t) {
		size = s;
		type = t;
	}
}
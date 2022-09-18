package Ch07;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영
 * 내용 : 예제 7-5 정적 메소드 예제
 */
interface Employable {
	String getName();
	
	static boolean isEmpty (String str) {
		if (str == null || str.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}
}

class Employee implements Employable {
	private String name;
	
	public Employee (String name) {
		if (Employable.isEmpty(name) == true) {
			throw new RuntimeException("이름은 반드시 입력하여야 함!");
		}
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}

public class P296_StaticMethodTest2 {
	public static void main(String[] args) {
		Employable employee1 = new Employee("홍길동");
		// Employable emplovee2 = new Employee("");
	}
}

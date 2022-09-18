package Ch06;
/*
 * 날짜 : 2022/09/18
 * 이름 : 심규영 
 * 내용 : has-a 관계 예제, P265
 */
public class EmployeeTest2 {
	public static void main(String[] args) {
		Date birth = new Date(1990, 1, 1);
		Employee3 employee3 = new Employee3("홍길동", birth);
		System.out.println(employee3);
	}
}

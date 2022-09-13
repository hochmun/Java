package Ch06;
/*
 * 날짜 : 2022/09/11
 * 이름 : 심규영
 * 내용 : Person 클래스와 Student 클래스 만들어보기, P238
 */
class Person2 {
	String name;
	public Person2 () {}
	public Person2 (String theName) {
		this.name = theName;
	}
}

class Employee extends Person2 {
	String id;
	public Employee () {
		super();
	}
	public Employee (String name) {
		super(name);
	}
	public Employee (String name, String id) {
		super(name);
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id="+id+" nmae="+name+"]";
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("Kim", "20210001");
		System.out.println(e);
	}
}

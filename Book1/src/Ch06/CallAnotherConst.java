package Ch06;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 :	this로 다른 생성자 호출하기, P172
 * 		this를 사용하여 주소 값 반환하기, P173
 */
class Person {
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
	}
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}

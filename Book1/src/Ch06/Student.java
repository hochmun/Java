package Ch06;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 학생 클래스 구현하기, P175
 */
public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student (String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}

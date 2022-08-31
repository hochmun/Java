package Ch05;
/*
 * 날짜 : 2022/08/29
 * 이름 : 심규영
 * 내용 : 학생 클래스 만들기, P129
 * 		학생 이름과 주소 출력하는 메서드 만들기, P132
 * 		학생 이름을 반환하는 메서드, P141
 * 		학생 이름을 부여하는 메서드, P142
 * 		Student 클레스에 main() 함수 추가하기, P144
 * 		private 사용하기, P162
 * 		get(), set() 메서드 사용하기, P164
 */
public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	// 학생 이름을 반환하는 메서드, P141
	public String getStudentName() {
		return studentName;
	}
	// 학생 이름을 부여하는 메서드, P142
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	// Student 클레스에 main() 함수 추가하기, P144
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}

package Ch05;
/*
 * 날짜 : 2022/08/19
 * 이름 : 심규영
 * 내용 : 학생 이름과 주소 출력하는 메서드 만들기
 */
public class P132 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // 이름,주소 출력
	}
}

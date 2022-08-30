package Ch06;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 클래스 이름으로 static 변수 참조하기, P186
 */
public class StudentTest3 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.serialNum);
		System.out.println(studentLee.studentName+" 학번:"+studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.serialNum);
		System.out.println(studentSon.studentName+" 학번:"+studentSon.studentID);
	}
}

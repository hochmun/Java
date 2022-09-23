package p564_School;
/*
 * 날짜 : 2022/09/23
 * 이름 : 심규영
 * 내용 : 일반 과목 학점 정책 클래스
 */
public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		String grade;
		
		if (point >= 90 && point <= 100) {
			grade = "A";
		} else if (point >= 80) {
			grade = "B";
		} else if (point >= 70) {
			grade = "C";
		} else if (point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}

}

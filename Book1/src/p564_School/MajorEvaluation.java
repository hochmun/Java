package p564_School;
/*
 * 날짜 : 2022/09/23
 * 이름 : 심규영
 * 내용 : 필수 과목 학점 정책 클래스
 */
public class MajorEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		// TODO Auto-generated method stub
		String grade;
		if (point >= 95 && point <= 100) {
			grade = "S";
		} else if (point >= 90) {
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
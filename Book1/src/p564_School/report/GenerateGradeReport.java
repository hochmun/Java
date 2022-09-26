package p564_School.report;
/*
 * 날짜 : 2022/09/23
 * 이름 : 심규영
 * 내용 : 리포트 클래스 구현하기
 */
import java.util.ArrayList;

import p564_School.BasicEvaluation;
import p564_School.Define;
import p564_School.GradeEvaluation;
import p564_School.MajorEvaluation;
import p564_School.PassFailEvalustion;
import p564_School.School;
import p564_School.Score;
import p564_School.Student;
import p564_School.Subject;

public class GenerateGradeReport {
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름 |   학번   |  필수과목  | 점수 \n";
	public static final String LINE = "-----------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t"+subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	public void makeBody(Subject subject) {
		ArrayList<Student> studentList = subject.getStudentList();
		
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName())
			.append(" | ")
			.append(student.getStudentId())
			.append(" | ")
			.append(student.getMajorSubject().getSubjectName()+"\t")
			.append(" | ");
			
			getScoreGrade(student, subject.getSubjectId());
			
			buffer.append('\n').append(LINE);
		}
	}
	
	public void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId();
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), 
				new MajorEvaluation(), new PassFailEvalustion()};
		
		for (int i = 0; i < scoreList.size(); i++) {
			Score score = scoreList.get(i);
			if (score.getSubject().getSubjectId() == subjectId) {
				String grade;
				if (score.getSubject().getGradeType() == Define.PF_TYPE) {
					grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
				} else {
					if (score.getSubject().getSubjectId() == majorId) {
						grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
					} else {
						grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
					}
				}
				buffer.append(score.getPoint())
				.append(":")
				.append(grade)
				.append(" | ");
			}
		}
	}
	
	public void makeFooter() {
		buffer.append("\n");
	}
}

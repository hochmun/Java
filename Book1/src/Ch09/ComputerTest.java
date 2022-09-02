package Ch09;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 추상 클래스 테스트하기, P289
 */
public class ComputerTest {
	public static void main(String[] args) {
		//Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
	}
}

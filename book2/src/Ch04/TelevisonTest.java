package Ch04;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 생성자 만들어 보기, P157
 */
public class TelevisonTest {
	public static void main(String[] args) {
		Television myTv = new Television(7, 10, true);
		myTv.print();
		
		Television yourTv = new Television(11, 20, true);
		yourTv.print();
	}
}

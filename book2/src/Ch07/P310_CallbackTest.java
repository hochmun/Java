package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : 예제 7-7 액션 이벤트 처리
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class P310_CallbackTest {
	public static void main(String[] args) {
		// 익명 클래스가 정의되면서 동시에 객체도 생성된다.
		ActionListener listener = new ActionListener() {
			public void actionPerformed (ActionEvent event) {
				System.out.println("beep");
			}
		};
		Timer t = new Timer(1000, listener);
		t.start();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

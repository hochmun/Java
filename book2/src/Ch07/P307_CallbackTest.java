package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : 예제 7-6 액션 이벤트 처리
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class P307_CallbackTest {
	public static void main(String[] args) {
		class MyClass2 implements ActionListener {
			public void actionPerformed (ActionEvent event) {
				System.out.println("beep");
			}
		}
		ActionListener listener = new MyClass2();
		Timer t = new Timer(1000, listener);
		t.start();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}


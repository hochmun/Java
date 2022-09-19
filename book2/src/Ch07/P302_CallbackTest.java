package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : LAB 타이머 이벤트 처리
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class MyClass implements ActionListener {
	public void actionPerformed (ActionEvent event) {
		System.out.println("beep");
	}
}

public class P302_CallbackTest {
	public static void main(String[] args) {
		ActionListener listener = new MyClass();
		Timer t = new Timer(1000, listener);
		t.start();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

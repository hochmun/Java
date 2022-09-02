package Ch10;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : Queue 인터페이스 정의하기, P341
 */
public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getSize();
}

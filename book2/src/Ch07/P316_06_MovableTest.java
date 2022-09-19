package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : Programming 6번 문제
 */
interface Movable {
	void move (int dx, int dy);
}

class Circle4 implements Movable {
	int dx;
	int dy;
	
	public Circle4() {
		dx = 0;
		dy = 0;
	}
	@Override
	public void move(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		System.out.println("["+dx+"], ["+dy+"]");
	}
	
}

class Rectangle3 implements Movable {
	int dx;
	int dy;
	
	public Rectangle3() {
		dx = 0;
		dy = 0;
	}
	@Override
	public void move(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		System.out.println("["+dx+"], ["+dy+"]");
	}
	
}

public class P316_06_MovableTest {
	public static void main(String[] args) {
		Movable [] move = new Movable[2];
		move[0] = new Circle4();
		move[1] = new Rectangle3();
		
		move[0].move((int)(Math.ceil(Math.random()*10)), (int)(Math.ceil(Math.random()*10)));
		move[1].move((int)(Math.ceil(Math.random()*10)), (int)(Math.ceil(Math.random()*10)));
	}
}

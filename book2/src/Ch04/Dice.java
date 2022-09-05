package Ch04;

public class Dice {
	//속성
	private int value;
	//생성자
	public Dice() {
		value = 0;
	}
	//getter, setter
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	//기능
	public void roll() {
		this.value = (int) (Math.random() * 6 + 1);
	}
}

package Ch04;
/*
 * 날짜 : 2022/09/05
 * 이름 : 심규영
 * 내용 : 주사위 게임, P182
 */
public class DiceTest {
	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int count = 0;
		
		while (d1.getValue() + d2.getValue() != 2) {
			count++;
			d1.roll();
			d2.roll();
			System.out.println("주사위1= "+d1.getValue()+" 주사위2= "+d2.getValue());
		}
		
		System.out.println("(1, 1)이 나오는데 걸린 횟수= "+count);
	}
}

package Ch02;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 비트 연산자 실습하기, P73
 */
public class BitOperator {
	public static void main(String[] args) {
		
		byte status = 0b01101110;
		System.out.print("문열림 상태="+((status & 0b00000100)!=0));
	}
}

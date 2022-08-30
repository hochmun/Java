package Ch03;
/*
 * 날짜 : 2022/08/30
 * 이름 : 심규영
 * 내용 : 정수의 합 계산하기, P100
 */
public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 정수의 합 = "+sum);
	}
}

package Ch04;
/*
 * 날짜 : 2022/08/18
 * 이름 : 심규영
 * 내용 : while문 활용하여 1부터 10까지 더하기
 */
public class P109 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}

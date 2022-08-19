package Ch04;
/*
 * 날짜 : 2022/08/18
 * 이름 : 심규영
 * 내용 : break문 예제
 */
public class P121 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
}

package Ch04;
/*
 * 날짜 : 2022/08/18
 * 이름 : 심규영
 * 내용 : 중첩된 반복문
 */
public class P116 {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + "=" + dan * times);
			}
			System.out.println(); // 한 줄 띄워서 출력
		}
	}
}

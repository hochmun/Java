package Ch03;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : 사각형 모양 출력하기, P106
 */
public class NestedLoop {
	public static void main(String[] args) {
		
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 10; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

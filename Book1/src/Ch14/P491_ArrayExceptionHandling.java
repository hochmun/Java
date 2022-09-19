package Ch14;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : try-catch문 사용하기
 */
public class P491_ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료");
	}
}

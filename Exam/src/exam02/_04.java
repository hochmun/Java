package exam02;

public class _04 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// 4회 반복
		for(int i = 1; i <= 4; i++) {
			// 앞쪽에 빈별 입력
			for(int j = 0; j < 4-i; j++) {
				sb.append("☆");
			}
			// 중간에 꽉찬별 입력
			for(int j = 1; j <= (i*2)-1; j++) {
				sb.append("★");
			}
			// 뒤쪽에 빈별 입력
			for(int j = 0; j < 4-i; j++) {
				sb.append("☆");
			}
			sb.append("\n");
		}
		// 출력
		System.out.println(sb);
	}
}

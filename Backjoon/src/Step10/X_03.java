package Step10;
/*
 * 날짜 : 2022/09/07
 * 이름 : 심규영
 * 내용 : 백준 9단계 3번째 문제, 재귀함수가 뭔가요?
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class X_03 {
	public static StringBuilder sb = new StringBuilder();
	public static int count = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		f(N);
		
		System.out.println(sb);
	}
	
	public static void f(int N) {
		
		
		if(N < 1) {
			sb.append(un(count)).append("\"재귀함수가 뭔가요?\"").append("\n")
			.append(un(count)).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n")
			.append(un(count)).append("라고 답변하였지.").append("\n");
			count--;
		} else {
			sb
			.append(un(count)).append("\"재귀함수가 뭔가요?\"").append("\n")
			.append(un(count)).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n")
			.append(un(count)).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n")
			.append(un(count)).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
			count++;
			f(N-1);
			sb.append(un(count)).append("라고 답변하였지.").append("\n");
			count--;
		}
	}
	
	public static String un(int N) {
		if (N > 0) {
			return "____" + un(N-1);
		} else {
			return "";
		}
	}
}

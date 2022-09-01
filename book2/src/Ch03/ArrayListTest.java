package Ch03;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : ArrayList 사용, P122
 */
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("철수");
		list.add("영희");
		list.add("순신");
		list.add("자영");
		for (String obj : list) {
			System.out.print(obj+" ");
		}
	}
}

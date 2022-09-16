package Ch12;
/*
 * 날짜 : 2022/09/16
 * 이름 : 심규영
 * 내용 : LinkedList 테스트하기, P416
 */
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D");
		System.out.println(myList);
		
		myList.addFirst("0");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}
}

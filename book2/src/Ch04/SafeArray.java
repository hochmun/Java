package Ch04;
/*
 * 날짜 : 2022/09/02
 * 이름 : 심규영
 * 내용 : 안전한 배열 만들기, P169
 */
public class SafeArray {
	//속성
	private int a[];
	public int length;
	//생성자
	public SafeArray(int size) {
		a = new int [size];
		length = size;
	}
	//기능
	public int get(int index) {
		if (index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}
	
	public void put (int index, int value) {
		if (index >= 0 && index < length) {
			a[index] = value;
		} else {
			System.out.println("잘못된 인덱스 "+index);
		}
	}
}

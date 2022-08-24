package Step06;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] AB = new int [2];
		for(int i = 0; i < 2; i++) {
			int a = sc.nextInt();
			int hun = a / 100;
			int ten = ( a / 10) % 10;
			int one = a % 10;
			AB[i] = one * 100 + ten * 10 + hun;
		}
		sc.close();
	}
}

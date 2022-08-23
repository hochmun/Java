package Step06;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		boolean [] abc = new boolean [26];
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			int n = (int)ch - 97;
			abc [n] = true;
		}
	}
}

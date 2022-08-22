package Step05;

public class _02 {
	public static void main(String[] args) {
		int SelfNumber [] = new int [10000];
		for(int i = 0; i < 10000; i++) {
			SelfNumber[i] = i+1;
		}
		for(int i = 1; i <= 10000; i++) {
			if(d(i))
		}
	}


	public static int d (int N) {
		int sum = N;
		String number = String.valueOf(N);
		for(int i = 0; i < number.length(); i++) {
			int j = Character.digit(number.charAt(i), 10);
			sum += j;
		}
		return sum;
	}
}
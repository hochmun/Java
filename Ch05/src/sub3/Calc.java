package sub3;

public class Calc {
	// 싱글톤
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;	
	}
	public int multi(int x, int y) {
		return x*y;
	}
	public int diy(int x, int y) {
		return x/y;
	}
}

package Ch05;

public class Single {
	private static Single instance = new Single();
	private Single () {}
	
	public static Single  getInstance() {
		return instance;
	}
}

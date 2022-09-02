package Ch04;
/*
 * 날짜 : 2022/09/01
 * 이름 : 심규영
 * 내용 : Television 클래스 작성하고 객체 생성해보기, P152
 * 		생성자 만들어 보기, P157
 */


public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 "+ channel + "이고 볼륨은 "+ volume+"입니다.");
	}
}


/*
public class Television {
	//속성
	int channel;
	int volume;
	boolean onOff;
	
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		System.out.println("나의 텔레비젼의 채널은 "+myTv.channel+
				"이고 볼륨은 "+myTv.volume+"입니다.");
		System.out.println("너의 텔레비젼의 채널은 "+yourTv.channel+
				"이고 볼륨은 "+yourTv.volume+"입니다.");
	}
}
 */

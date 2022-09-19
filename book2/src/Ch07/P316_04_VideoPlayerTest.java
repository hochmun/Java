package Ch07;
/*
 * 날짜 : 2022/09/19
 * 이름 : 심규영
 * 내용 : Programming 4번 문제
 */
interface Controllable {
	void play();
	void stop();
}

class VideoPlayer implements Controllable {

	@Override
	public void play() {
		System.out.println("VideoPlayer play");
	}

	@Override
	public void stop() {
		System.out.println("VideoPlayer stop");
	}
	
}

public class P316_04_VideoPlayerTest {
	public static void main(String[] args) {
		Controllable videoplayer = new VideoPlayer();
		videoplayer.play();
		videoplayer.stop();
	}
}

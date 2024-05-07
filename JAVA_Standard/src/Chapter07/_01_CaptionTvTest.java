package Chapter07;

class Tv { // 부모클래스
	boolean power; // 전원상태(on/off)
	int channel; // 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv { // 부모클래스(Tv)를 상속받은 CaptionTv클래스
	boolean caption; // 멤버변수, false로 초기화 된다.
	
	// 메서드
	void displayCaption (String text) {
		if(caption) { // 캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

public class _01_CaptionTvTest {
	
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10; // 조상 클래스로부터 상속받은 멤버
		ctv.channelUp(); // 조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		
		// 자체 메서드, caption이 false로 초기화 되서 출력안된다.
		ctv.displayCaption("Hello, World");
		
		// 갭션(자막) 기능을 켠다.
		ctv.caption = true; 
		ctv.displayCaption("Hello, World"); // 자체 메서드
	}
}
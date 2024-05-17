package Chapter07;

class Card1 {
	final int NUMBER; // 상수지만 선언과 함께 초기화 하지 않고
	final String KIND; // 생성자에서 단 한번만 초기화할 수 있다.
	static int width = 100;
	static int height = 250;
	
	// 매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화 한다.
	Card1(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	Card1() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class _12_FinalCardTest {

	public static void main(String[] args) {
		Card1 c = new Card1("HEART", 10); // 생성자를 통해서 상수를 초기화 한다.
		// c.NUMBER = 5; // 에러(cannot assign a value to final variable NUMBER)
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());을 호출하는것과 같다.
	}
}
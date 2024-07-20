package Chapter09;

class Card1 {
	String kind;
	int number;
	
	Card1() {
		this("SPACE", 1); // Card(String kind, int number)를 호출
	}
	
	Card1(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// Card인스턴스의 kind와 number를 문자열로 반환한다.
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

public class _06_CardToString2 {
	/*	
	 	Card1인스턴스의 toString()을 호출하면 인스턴스가 갖고 있는 인스턴스변수 kind와
	 	number의 값을 문자열로 변환하여 반환하도록 toString()을 오버라이딩 했다.
	 	오버라이딩 toString()의 접근제어자도 public으로 했다는 것을 눈 여겨 보자
	 */
	public static void main(String[] args) {
		Card1 c1 = new Card1();
		Card1 c2 = new Card1("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
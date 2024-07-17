package Chapter09;

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPACE", 1); // 매개변수 2개 받는 생성자 호출
	}
	
	Card(String kind, int number) { // 멤버변수 세팅
		this.kind = kind;
		this.number = number;
	}
}

public class _04_CardToString {
	/*
	 	Card인스턴스 두 개를 생성한 다음, 각 인스턴스에 toStinrg()을 호출한 결과를 출력했다.
	 	Card클래스에서 Object클래스로부터 상속받은 toString()을 오버라이딩하지 않았기 때문에
	 	Card인스턴스에 toString()을 호출하면, Object클래스의 toString()이 호출된다.
	 	그래서 위의 결과에 클래스이름과 해시코드가 출력되었다. 서로 다른 인스턴스에 대해서
	 	toString()을 호출하였으므로 클래스의 이름은 같아도 해시코드값이 다르다는 것을 확인할 수 있다.
	 */
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
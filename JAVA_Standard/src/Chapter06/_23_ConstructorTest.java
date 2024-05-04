package Chapter06;

class Data11 {
	int value;
}

class Data22 {
	int value;
	
	public Data22(int x) { // 매개변수가 있는 생성자.
		value = x;
	}
}

public class _23_ConstructorTest {
	
	public static void main(String[] args) {
		Data11 d1 = new Data11(); // 생성자를 클래스 안에 만들지 않으면, 기본생성자가 자동 적용된다.
		
		// 클래서에서 매개변수가 있는 생성자를 생성하면, 객체 생성시 기본 생성자를 임의로 호출할수 없고, 명시해줘야 한다.
		// Data22 d2 = new Data22(); // compile error 발생
		
	} // main의 끝.
}
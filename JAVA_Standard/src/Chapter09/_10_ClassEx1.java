package Chapter09;

final class Card2 {
	String kind;
	int num;
	
	Card2() {
		this("SPADE", 1);
	}
	
	Card2(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ":" + num;
	}
}

public class _10_ClassEx1 {
	/*	
	 	1, getClass()는 자신이 속한 클래스의 Class객체를 반환하는 메서드다.
	 	   파일 형태로 저장되어 있는 클래스를 읽어서 Class클래스에 정의된 형식으로 변환하는 것이다.
	 	2, Class cObj = new Card2().getClass ==> 생성된 클래스로부터 객체를 얻는 방법
	 	3, Class cObj = Card2.class ==> 클래스 리터럴(*.class)로 부터 얻는 방법
	 	4, Class cObj = Class.forName("Card"); ==> 클래스 이름으로 부터 얻는 방법
	 */
	public static void main(String[] args) throws Exception{
		Card2 c = new Card2("HEART", 3); // new연산자로 객체 생성
		Card2 c2 = Card2.class.newInstance(); // Class객체를 통해서 객체생성
	
		Class cObj = c.getClass(); // 클래스 리터럴(*.class)로 부터 객체 얻는 방법
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName()); // 클래스 이름 가져오기
		System.out.println(cObj.toGenericString()); // 클래스의 상세정보와 이름을 가져온다.
		System.out.println(cObj.toString()); // object의 오버라이딩된 메소드가 호출된다.
	}
}
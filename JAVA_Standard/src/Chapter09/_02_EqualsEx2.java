package Chapter09;

class Person {
	long id;
		
		public boolean equals(Object obj) { // p2가 들어왔다.(업캐스팅)
			if(obj != null && obj instanceof Person) // obj가 Person으로 형변환이 가능하면
				// obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요하다.
				return id == ((Person)obj).id; // 다운캐스팅 한 뒤 p2의 id값을 가져와서, p1의 id값과 비교한다. 
			else
				// 타입이 Person이 아니면 값을 비교할 필요도 없다.
				return false;
		}
		
		Person(long id) {
			this.id = id;
		}
}

public class _02_EqualsEx2 {
	
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
	
		if(p1 == p2) // 주소 값 비교
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
		
		if(p1.equals(p2)) // 객체내부 id 문자열 비교
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	} // main메서드의 끝
}
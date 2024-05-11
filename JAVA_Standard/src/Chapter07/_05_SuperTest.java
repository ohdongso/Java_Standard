package Chapter07;

public class _05_SuperTest {
	/*
	 	1, super는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
	 	2, 상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을 때는 super를 붙여서 구별할 수 있다.
	 	3, 조상클래스로부터 상속받은 멤보도 자손 클래스 자신의 멤버이므로 super대신 this를 사용할 수 있다.
	 	   그래도 조상 클래시의 멤버와 자손클래스의 멤버가 중복 정의되어 서로 구별해야하는 경우에만 super를 사용하는 것이 좋다.
	 */
	public static void main(String[] args) {
		Child c = new Child(); // 자식객체 생성 부모의 x 멤버변수 호출가능
		c.method(); // 자식클래스 메서드 호출, 부모의 멤버변수 x를 사용
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
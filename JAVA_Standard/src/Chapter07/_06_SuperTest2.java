package Chapter07;

public class _06_SuperTest2 {
	
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.method();
	}
}

class Parent1 { // 부모클래스
	int x = 10; // 부모클래스 멤버변수
}

class Child1 extends Parent1 { // 자식클래스 부모클래스를 상속 받음
	int x = 20; // 자식클래스 멤버변수
	void method() {
		System.out.println("x=" + x); // 특정예약어를 붙이지 않은경우 자식과 부모에 동일한 멤버변수가 있다면, 자식멤버변수가 호출된다.
		System.out.println("this.x=" + this.x); // 자식클래서 멤버변수 호출
		System.out.println("super.x=" + super.x); // 부모클래스 멤버변수 호출
	}
}
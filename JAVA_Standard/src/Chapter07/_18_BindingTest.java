package Chapter07;

public class _18_BindingTest {
	 
	/*
	 	멤버변수가 조상 클래스와 자손 클래스에 중복으로 정의된 경우 객체 생성과는 상관없이 클래스타입에 해당하는 멤버변수가 호출된다.
	 	하지만, 중복 정의되지 않은 경우, 조상타입의 참조변수를 사용했을 때와 자손타입의 참조변수를 사용했을 때의 차이는 없다.
	 	중복되지 않은 경우 하나뿐이므로 선택의 여지가 없기 때문이다.
	 	
	 	메서드는 중복으로 선언되도 객체를 따라간다. 멤버변수는 중복으로 선언되면 클래스 타입을 따라간다.
	 */
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	} 
}

class Parent2 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}

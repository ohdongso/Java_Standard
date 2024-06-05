package Chapter07;

class A {
	public void methodA(B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class _27_InterfaceTest {
	/*
	 - 클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provider)이 있다.
	 - 메서드를 사용(호출)하는 쪽(User)에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다.(내용은 몰라도 된다.)
	 
	 */
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}
} // main 끝.

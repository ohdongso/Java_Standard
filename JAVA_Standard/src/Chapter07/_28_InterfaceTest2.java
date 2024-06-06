package Chapter07;

class A1 {
	void autoPlay(I i) {
		i.play();
	}
}

interface I {
	public abstract void play();
}

class B1 implements I {
	@Override
	public void play() {
		System.out.println("play in B1 class");
	}
}

class C1 implements I {
	@Override
	public void play() {
		System.out.println("play in C1 class");
	}
}

public class _28_InterfaceTest2 {
	
	/*
	 	클래스 A가 인터페이스 I를 사용해서 작성되긴 하였지만, 이처럼 매개변수를 통해서 
	 	인터페이스 I를 구현한 클래스의 인스턴스를 동적으로 제공받아야 한다.
	 */
	
	public static void main(String[] args) {
		A1 a = new A1();
		a.autoPlay(new B1()); // void autoPlay(I i) 호출
		a.autoPlay(new C1()); // void autoPlay(I i) 호출
	}
}
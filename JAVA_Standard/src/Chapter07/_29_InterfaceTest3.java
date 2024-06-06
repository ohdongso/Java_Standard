package Chapter07;

public class _29_InterfaceTest3 {
	/*
	 	
	 */
	public static void main(String[] args) {
		A2 a = new A2();
		a.methodA(); // B2객체를 생성하고, 부모로 업캐스팅 한다음, 메소드 호출시 오버라이딩된 메서드 2개가 각각 호출됨
	}
} // main 끝.

class A2 {
	void methodA() {
		// 제3의 클래스의 메서드를 통해서 인터페이스 I1을 구현한 클래스의 인스턴스를 얻는다.
		I1 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString()); // i로 Object클래스의 메서드 호출가능
	}
}

interface I1 {
	public abstract void methodB(); // 인터페이스 추상메서드
}

class B2 implements I1 {
	public void methodB() {
		System.out.println("methodB in B class"); // 인터페이스 methodB 메서드 오버라이딩
	}
	public String toString() { return "class B"; } // 조상 Object의 메서드 오버라이딩
}

class InstanceManager { // B2 객체를 반환하는 클래스
	public static I1 getInstance() {
		return new B2();
	}
}



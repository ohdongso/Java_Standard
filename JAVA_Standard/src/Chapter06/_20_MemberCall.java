package Chapter06;

/*
 	같은 클래스에 속한 멤버들 간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하다.
 	단, 클래스멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우에는 인스턴스를 생성해야 한다.
 	그 이유는 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수도 있기 때문이다.
 */

class MemberCall {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // 클래스 변수
	
	int iv2 = cv; // 인스턴스 메서드
	// static int cv2 = iv; // 에러. 클래스변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용가능
	
	static void staticMethod1() { // static 메서드
		System.out.println(cv); // 클래스 메서드에서 클래스 변수 사용 가능.
		// System.out.println(iv); // 에러. 클래스메서드에서 인스턴스변수를 사용불가.
		MemberCall c = new MemberCall(); // 객체를 생성하면 클래서 메서드에서 인스턴스 변수 사용가능
		System.out.println(c.iv); //체를 생성한 후에야 인스턴스변수의 참조가능.
	}
	
	void instanceMethod1() { // 인스턴스 메소드
		System.out.println(cv); // 인스턴스 메서드 에서 클래스변수 사용가능
		System.out.println(iv); // 인스턴스메서드에서는 인스턴스변수를 바로 사용가능.
	}
	
	static void staticMethod2() { // 클래스 메서드
		staticMethod1(); // 클래스 메서드 안에서 클래스 메서드 사용 가능
//		instanceMethod1(); // 에러. 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
		MemberCall c = new MemberCall(); // 클래스 메서드 내부에서 객체 생성후 인스턴스 메소드 사용가능
		c.instanceMethod1(); // 인스턴스를 생성한 후에야 호출할 수 있음.
	}
	
	void instanceMethod2() { // 인스턴스 메소드
		staticMethod1(); // 인스턴스메서드에서는 인스턴스메서드와 클래스메서드
		instanceMethod1(); // 모두 인스턴스 생성없이 바로 호출이 가능하다.
	}
}

public class _20_MemberCall {
	
	public static void main(String[] args) {
		
	}
}
package Chapter07;

public class _31_InnerEx1 {
	/*
	 	내부 클래스는 클래스 내에 선언된 클래스이다. 클래스에 다른 클래스를 선언하는 이유는 간단하다.
	 	두 클래스가 서로 긴밀한 관계에 있기 때문이다.
	 	
	 	한 클래스를 다른 클래스의 내부 클래스로 선언하면 두 클래스의 멤버들 간에 서로 쉽게 접근할 수 있다는 장점과 
	 	외부에는 불필요한 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다는 장점을 얻을 수 있다.
	 */
	
	/*
	 	내부 클래스 중에서 스태틱 클래스(StaticInner)만 static멤버를 가질 수 있다.
	 	드문 경우지만 내부 클래스에 static변수를 선언해야한다면 스태틱 클래스로 선언해야한다.
	 	다만 final과 static이 동시에 붙은 변수는 상수(constant)이므로 모든 내부 클래스에서 정의가 가능하다.
	 */
	class InstaceInner {
		int iv = 100;
//		static int cv = 100;			// 에러! static변수를 선언할 수 없다.
		final static int CONST = 100;   // final static은 상수이므로 허용
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static클래스만 static 멤버를 정의할 수 있다.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300; // 에러! static변수를 선언할 수 없다.
			final static int CONST = 300; // final static은 상수이므로 허용
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstaceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
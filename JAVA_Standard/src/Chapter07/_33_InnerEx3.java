package Chapter07;

public class _33_InnerEx3 {
	/*
	 	내부 클래스에서 외부 클래스의 변수들에 대한 접근성을 보여 주는 예제이다.
	 	인스턴스클래스는 외부 클래스의 인스턴스멤버이기 때문에 인스턴스변수 outerlv와 static변수 outerCv를 모두 사용할 수 있다.
	 	심지어는 outerlv의 접근 제어자가 private일지라도 사용가능하다.
	 	
	 	스태틱 클래스는 외부 클래스의 static멤버이기 때문에 외부 클래스의 인스턴스멤버인 outerlv와 InstanceInner를 사용할 수 없다.
	 	단지 static멤버인 outerCv만을 사용할 수 있다.
	 	
	 	지역클래스(LocalInner)는 외부 클래스의 인스턴스멤버와 static멤버를 모두 사용할 수 있으며, 지역 클래스가 포함된 메서드에 정의된
	 	지역변수도 사용할 수 있다. 단, final이 붙은 지역변수만 접근가능한데 그 이유는 메서드가 수행을 마쳐서 지역변수가 소멸된 시 점에도,
	 	지역 클래스의 인스턴스가 소멸된 지역변수를 참조하려는 경우가 발생할 수 있기 때문이다.
	 */
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int ilv = outerIv; // 외부 클래스의 private멤버도 접근가능하다.
		int ilv2 = outerCv;
	}
	
	static class StaticInner {
		// 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
		// int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; // JDK1.8부터 final 생략가능
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			
			// 외부 클래스의 지역변수는 final이 붙은 변수 (상수)만 접근가능하다.
			// int liv3 = lv; ==> 에러!!!(JDK1.8부터 에러 아님)
			int liv4 = LV; // OK
		}
	}
}
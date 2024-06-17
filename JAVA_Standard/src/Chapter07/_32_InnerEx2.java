package Chapter07;

public class _32_InnerEx2 {
	
	/*
	 	인스턴스멤버는 같은 클래스에 있는 인스턴스멤버와 static멤버 모두 직접 호출이 가능하지만, static 멤버는
	 	인스턴스멤버를 직접 호출할 수 없는 것처럼, 인스턴스클래스는 외부 클래스의 인스턴스멤버를 객체생성 없이 바로
	 	사용할 수 있지만, 스태틱 클래스는 외부 클래스의 인스턴스멤버를 객체생성없이 사용할수 없다.
	 	
	  	마찬가지로 인스턴스클래스는 스태틱 클래스의 멤버들을 객체생성 없이 사용할 수 있지만, 스태틱 클래스에서는
	  	인스턴스클래스의 멤버들을 객체생성 없이 사용할 수 없다.
	 */
	
	class InstanceInner {}
	static class StaticInner {}
	
	// 인스턴스멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	
	// static 멤버 간에는 서로 직접 접근이 가능하다.
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static 메서드에, 인스턴스 멤버를 생성 할 수 없다.
		// InstanceInner obj1 = new InstanceInner();
		
		// 굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
		// 인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
		_32_InnerEx2 outer = new _32_InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
		
		// static 객체는 생성가능
		StaticInner obj2 = new StaticInner();		
	}
	
	void instanceMethod() {
		// 인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능하다.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
		// LocalInner Iv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner Iv = new LocalInner();
	}
}